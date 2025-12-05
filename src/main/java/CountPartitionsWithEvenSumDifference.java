
public class CountPartitionsWithEvenSumDifference {
    public static void main(String[] args) {
        int []nums={10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }

    public static int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        int result=0;
        int leftSum=0;
        for(int i=0;i<n-1;i++){
            leftSum+=nums[i];
            int rightSum=sum-leftSum;
            if((leftSum-rightSum)%2==0)
                result++;
        }
        return result;
    }
}