

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        ListNode list1 =new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 =new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode finalList=mergeTwoLists(list1,list2);
        System.out.print("[");
        while(finalList!=null){
            System.out.print(finalList.val+" ");
            finalList=finalList.next;
        }
        System.out.println("]");
    }
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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode dummy=new ListNode(0);
        ListNode list3=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list3.next=list1;
                list1=list1.next;
            }
            else{
                list3.next=list2;
                list2=list2.next;
            }
            list3=list3.next;
        }
        if(list1!=null)
            list3.next=list1;

        if(list2!=null)
            list3.next=list2;

        return dummy.next;
    }

}
/*
21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */