import java.util.Arrays;

public class PrimeNumberOfSetBitsInBinaryRepresentation {

        public int countPrimeSetBits(int left, int right) {
            int count=0;
            while(left<=right){
                int n=Integer.bitCount(left);
                if(isPrime(n))
                    count+=1;
                left++;
            }
            return count;
        }
        public boolean isPrime(int n){
            if(n<2)
                return false;
            for(int i=2;i*i<n;i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }