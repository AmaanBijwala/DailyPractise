
class NumberOfSubstringsWithOnly1s {
    public static void main(String[] args) {
        String s="0110111";
        System.out.println(numSub(s));
    }
    public static int numSub(String s) {
        int count=0;
        long res=0;
        int mod=1000000007;
        for(Character c:s.toCharArray()){
            if(c=='1')
                count++;
            else{
                res=(res+((long)count*(count+1)/2))%mod;
                count=0;
            }
        }
        res=(res+(count*(count+1)/2))%mod;
        return (int)res;
    }
}