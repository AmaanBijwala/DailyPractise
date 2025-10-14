
import java.util.*;
public class AdjacentIncreasingSubarraysDetectionI {
    public static void main(String[] args)
    {
        List<Integer> nums=Arrays.asList(2,5,7,8,9,2,3,4,3,1); int k=3;
        System.out.println(hasIncreasingSubarrays(nums, k));
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i<=n-2*k;i++){
            boolean firstInc=true;
            boolean secondInc=true;
            for(int j=i;j<i+k-1;j++){
                if(nums.get(j)>=nums.get(j+1)){
                    firstInc=false;
                    break;
                }
            }
            for(int j=i+k;j<i+2*k-1 && firstInc;j++){
                if(nums.get(j)>=nums.get(j+1)){
                    secondInc=false;
                    break;
                }
            }
            if(firstInc && secondInc)
                return true;
        }
        return false;
    }



}

