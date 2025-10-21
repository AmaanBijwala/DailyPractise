import java.util.HashMap;
import java.util.Map;

public class MaximumFrequencyfAnElementAfterPerformingOperationsI {
    public static void main(String[] args) {
        int[] nums = {1,4,5};
        int k = 1;
        int numOperations = 2;
        System.out.println(maxFrequency(nums,k,numOperations));
    }

    public static int maxFrequency(int[] nums, int k, int numOperations) {
            int maxEl = Integer.MIN_VALUE;
            for (int i : nums) {
                maxEl = Math.max(i, maxEl);
            }
            maxEl += k;

            // Build frequency array of nums
            int[] freq = new int[maxEl + 1];
            for (int num : nums) {
                freq[num]++;
            }

            // Build prefix sum of frequencies
            for (int i = 1; i <= maxEl; i++) {
                freq[i] += freq[i - 1];
            }

            int res = 0;

            // For each possible target value
            for (int target = 0; target <= maxEl; target++) {
                int l = Math.max(0, target - k);
                int r = Math.min(maxEl, target + k);

                // total elements within [target - k, target + k]
                int totalCount = freq[r] - (l > 0 ? freq[l - 1] : 0);

                // number of elements exactly equal to target
                int targetCount = (target > 0 ? freq[target] - freq[target - 1] : freq[target]);

                // Elements we can convert (up to numOperations)
                int maxPossibleFreq = Math.min(totalCount, targetCount + numOperations);

                res = Math.max(res, maxPossibleFreq);
            }

            return res;
        }
}
