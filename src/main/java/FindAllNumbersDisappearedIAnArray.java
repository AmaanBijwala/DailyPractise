import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedIAnArray {
    public static void main(String[] args)
    {
        int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }


        public static List<Integer> findDisappearedNumbers(int[] nums) {
            Set<Integer> s=new HashSet<>();
            int n=nums.length;
            List<Integer>l=new ArrayList<>();
            for(int i:nums){
                s.add(i);
            }
            for(int i=1;i<=n;i++){
                if(!s.contains(i))
                    l.add(i);
            }
            return l;
        }



}


/*
448. Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 */