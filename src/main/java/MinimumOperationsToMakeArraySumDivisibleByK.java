
public class MinimumOperationsToMakeArraySumDivisibleByK {
    public static void main(String[] args) {
        int[]nums={3,9,7};
        int k=5;
        System.out.println(minOperations(nums,k));
    }
        public static int minOperations(int[] nums, int k) {
            int sum=0;
            for(int no:nums){
                sum+=no;
            }
            int rem=sum%k;
            return rem==0?0:rem;
        }
    }