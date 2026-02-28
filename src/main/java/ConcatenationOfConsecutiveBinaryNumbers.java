import java.util.Stack;

public class ConcatenationOfConsecutiveBinaryNumbers {

        public int concatenatedBinary(int n) {
            int MOD=1000_000_007;
            long res=0;
            for(int i=1;i<=n;i++){
                int len=Integer.toBinaryString(i).length();
                res=((res<<len) | i) % MOD;
            }
            return (int)res;
        }
    }