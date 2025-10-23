
import java.util.Arrays;
import java.util.List;

public class CheckIfDigitsAreEqualInStringAfterOperationsI {
    public static void main(String[] args)
    {
        String s="3902";
        System.out.println(hasSameDigits(s));
    }


    public static boolean hasSameDigits(String s) {
        return getResult(s);
    }
    public static boolean getResult(String s){
        if(s.length()==2)
            return (s.charAt(0)==s.charAt(1))?true:false;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()-1){
            int sum=Integer.parseInt(s.charAt(i)+"")+Integer.parseInt(s.charAt(i+1)+"");
            sb.append((sum%10)+"");
            i++;
        }
        return getResult(sb.toString());
    }



}

