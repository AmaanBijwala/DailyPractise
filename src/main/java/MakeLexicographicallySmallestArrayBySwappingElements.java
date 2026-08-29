import java.util.*;
public class MakeSumDivisibleByP {
    public static void main(String[] args)
    {
        int [] nums={3,1,4,2};
        int p=3;
        System.out.println(minSubarray(nums,p));
    }


        public static  int minSubarray(int[] nums, int p) {
            int n=nums.length;
            int ans=n;
            long sum=0;
            for(int no:nums)
                sum+=no;
            long rem=sum%p;
            if(rem==0)
                return 0;
            Map<Long,Integer>m=new HashMap<>();
            m.put(0L,-1);
            long prefix=0;
            for(int j=0;j<n;j++){
                prefix=(prefix+nums[j])%p;
                long need=(prefix-rem+p)%p;
                if(m.containsKey(need)){
                    ans=Math.min(ans,j-m.get(need));
                }
                m.put(prefix,j);
            }
            return ans==n?-1:ans;
        }
    }