
public class MakeArrayElementsEqualToZero {
    public static void main(String args[]){
        int[] nums={1,0,2,0,3};
        System.out.println(countValidSelections(nums));
    }
    public static int countValidSelections(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int res=Math.abs(prefix[i]-suffix[i]);
                if(res==0)
                    count+=2;
                else if(res==1)
                    count+=1;
            }
        }
        return count;
    }
}