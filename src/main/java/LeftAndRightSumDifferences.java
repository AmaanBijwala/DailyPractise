public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] a={10,4,8,3};
        printArray(leftRightDifference(a));
    }
    public static int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int lsum=0;
        int rsum=0;
        int[] l=new int[n];
        int[] r=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            l[i]=lsum;
            r[n-i-1]=rsum;
            lsum+=nums[i];
            rsum+=nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            res[i]=Math.abs(l[i]-r[i]);
        }
        return res;
    }

    public static void printArray(int[] result){
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}

