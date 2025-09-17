
public class FindGreatestCommonDivisorOfArray {

    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aab";
        int [] nums={2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        return calculateGCD(min,max);
    }
    public static  int calculateGCD(int m,int n){
        while(n!=0){
            int temp=n;
            n=m%n;
            m=temp;
        }
        return m;
    }
}
