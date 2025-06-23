
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int [] res=getConcatenation(nums);
        printArray(res);
    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
    public static void printArray(int [] res){
        System.out.print("[");
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
