import java.util.*;
public class PalindromeOfNumber {
    public static void main(String[] args) {
        int x=-1215121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        String s=String.valueOf(x);
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
