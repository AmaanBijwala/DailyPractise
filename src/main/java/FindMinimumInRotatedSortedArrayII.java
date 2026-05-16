

import java.util.HashSet;
import java.util.Set;

public class FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int last = nums[n];
        int left = 0, right = n;

        while (left < n && nums[left] == last)
            left++;

        while (left < right) {
            int mid = left + right >> 1;

            if (nums[mid] > last)
                left = mid + 1;
            else
                right = mid;
        }

        return nums[left];
    }
}