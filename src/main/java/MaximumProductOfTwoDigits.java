import java.util.*;
public class NextGreaterNumericallyBalancedNumber {
    public static void main(String[] args)
    {
        System.out.println(nextBeautifulNumber(38));
    }

        public static int nextBeautifulNumber(int n) {
            if(n==0)
                return 1;
            return doesFreqaMatch(n);
        }
        public static int doesFreqaMatch(int n){
            while(n>0){
                n++;
                boolean getCount=isCountMatched(n);
                if(getCount)
                    return n;
            }
            return -1;
        }
        public static boolean isCountMatched(int n){
            Map<Integer,Integer>m=new HashMap<>();
            while(n>0){
                int d=n%10;
                n/=10;
                m.put(d,m.getOrDefault(d,0)+1);
            }
            for(Map.Entry<Integer,Integer>v:m.entrySet()){
                if(v.getKey()!=v.getValue())
                    return false;
            }
            return true;
        }



}
