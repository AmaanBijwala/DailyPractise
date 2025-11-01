
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }

        ListNode dummy = new ListNode(0);
        ListNode ref = dummy;

        while (head != null) {
            if (!s.contains(head.val)) {
                ref.next = head;
                ref = ref.next;
            }
            head = head.next;
        }

        ref.next = null;

        return dummy.next;
    }
}
