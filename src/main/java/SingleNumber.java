import java.util.LinkedHashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

        public static int singleNumber(int[] nums) {
            Map<Integer,Integer>m=new LinkedHashMap<>();
            for(int i:nums){
                m.put(i,m.getOrDefault(i,0)+1);
            }
            for(Map.Entry<Integer,Integer>val:m.entrySet()){
                if(val.getValue()==1)
                    return val.getKey();
            }
            return -1;
        }

}
/*
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.

 */