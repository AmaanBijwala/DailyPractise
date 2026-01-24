

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            i++;
            j--;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}