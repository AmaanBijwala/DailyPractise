
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountSquareSumTriples {
    public static void main(String[] args) {
        int n=5;
        System.out.println(countTriples(n));
    }

    public static int countTriples(int n) {
        int count=0;
        for(int a=1;a<=n;a++){
            for(int b=a+1;b<=n;b++){
                int sum=(a*a)+(b*b);
                int res=(int)Math.sqrt(sum);
                if(res*res==sum && res<=n)
                    count+=2;
            }
        }
        return count;
    }
}
