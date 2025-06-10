import java.util.*;
public class sumOfFirstNnumbers {
    public static void main(String[] args) {
        System.out.println(sumOFNos(5,0));
    }
    static int sumOFNos(int N,int sum){
        if(N==0){
            return sum;
        }
        return sumOFNos(N-1,sum+N);
    }
}
