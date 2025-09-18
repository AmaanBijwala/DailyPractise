
public class ThreeDivisors {
    public static void main(String[] args)
    {
        System.out.println(isThree(4));
    }
    public static  boolean isThree(int n) {
        int count=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                count++;
            if(count>3)
                return false;
        }
        return count==3?true:false;
    }
}

