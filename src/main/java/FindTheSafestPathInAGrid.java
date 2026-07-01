
import java.util.*;
class NumberOfLaserBeamsInABank{
    public static void main(String args[]){
        String[] bank={"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        int ans=0;
        int n=bank.length;
        int[] res=new int[n];
        int i=0;
        for(String s:bank){
            int count=0;
            for(char c:s.toCharArray()){
                if(c=='1'){
                    count++;
                }
            }
            res[i++]=count;
        }
        List<Integer>l=new LinkedList<>();
        for(int j=0;j<n;j++){
            if(res[j]!=0)
                l.add(res[j]);
        }
        if(l.isEmpty())
            return 0;
        int len=l.size();
        for(int m=0;m<len;m++){
            if(m==len-1)
                break;
            ans+=l.get(m)*l.get(m+1);
        }
        return ans;
    }
}