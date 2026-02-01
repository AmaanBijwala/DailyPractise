
import java.util.Arrays;

public class DivideAnArrayIntoSubarraysWithMinimumCostI {
    public int minimumCost(int[] nums) {
        int min=Integer.MAX_VALUE;
        int sMin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                sMin=min;
                min=nums[i];
            }
            else if(nums[i]<sMin)
                sMin=nums[i];
        }
        System.out.println("min "+min+"sMin "+sMin);
        return nums[0]+min+sMin;
    }
}