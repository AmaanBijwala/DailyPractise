
public class SmallestNumberWithAllSetBits {
    public static void main(String[] args)
    {
        System.out.println(smallestNumber(5));
    }
        public static int smallestNumber(int n) {
            String bin="";
            while(n>0){
                int mod=n%2;
                bin=mod+bin;
                n/=2;
            }
            int res=0;
            int power=0;
            for(int i=0;i<bin.length();i++){
                res+=Math.pow(2,power);
                power++;
            }
            return res;
        }
}
