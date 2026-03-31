
import java.math.BigInteger;

public class CheckIfStringsCanBeMadeEqualWithOperationsI {

    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        StringBuffer s3=new StringBuffer();
        s3.append(s1.charAt(2))
                .append(s1.charAt(1))
                .append(s1.charAt(0))
                .append(s1.charAt(3));
        if(s3.toString().equals(s2))
            return true;
        StringBuffer s4=new StringBuffer();
        s4.append(s1.charAt(0))
                .append(s1.charAt(3))
                .append(s1.charAt(2))
                .append(s1.charAt(1));
        if(s4.toString().equals(s2))
            return true;
        StringBuffer s5=new StringBuffer();
        s5.append(s1.charAt(2))
                .append(s1.charAt(3))
                .append(s1.charAt(0))
                .append(s1.charAt(1));
        if(s5.toString().equals(s2))
            return true;
        return false;
    }
}