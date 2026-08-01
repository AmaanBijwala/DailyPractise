
public class MinimumElementAfterReplacementWithDigitSum {

    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int no:nums){
            min=Math.min(min,sum(no));
        }
        return min;
    }
    public int sum(int no){
        int sum=0;
        while(no>0){
            sum+=no%10;
            no/=10;
        }
        return sum;
    }
}