
import java.util.*;
public class ValidTriangleNumber {
    public static void main(String[] args)
    {
        int[] nums={2,2,3,4};
        System.out.println(triangleNumber(nums));
    }


    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        // fix the largest side
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    // all pairs between i..j-1 with j are valid
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }



}


/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

Constraints:
0 <= num <= 231 - 1
Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */