import java.util.Arrays;
import java.util.List;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args)
    {
        int n=10;
        System.out.println(totalMoney(n));
    }

        public static int totalMoney(int n) {
            int count=1;
            int ans=0;
            int i=0;
            while(n>0){
                if(count%8==0){
                    i++;
                    count=1;
                }
                ans+=i+count;
                n--;
                count++;
            }
            return ans;
        }



}

