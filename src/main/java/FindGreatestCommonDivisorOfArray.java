import java.util.*;
class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        for(int i=nums[0];i>0;i--){
            if(nums[0]%i==0 && nums[nums.length-1]%i==0)
                return i;
        }
        return ans;
    }
}