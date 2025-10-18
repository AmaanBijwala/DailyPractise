
import java.util.*;

public class MaximumNumberOfDistinctElementsAfterOperations {
    public static void main(String args[]) {
        int[] nums={1,2,2,3,3,4};
        int k=2;
        System.out.println((maxDistinctElements(nums,k)));
    }

    public static int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : nums) {
            int curr = Math.min(Math.max(num - k, prev + 1), num + k);
            if (curr > prev) {
                cnt++;
                prev = curr;
            }
        }
        return cnt;

    }


}

