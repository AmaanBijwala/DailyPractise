//6)Find first reptivie charcter
//String str="adfavbn";
import java.util.*;
public class FindFirstRepetitiveCharacter {
    public static void main(String[] args) {
        Character c=findCharacter("adfavbn");
        System.out.println("1st repetitive charcter is "+c);
    }


    public static Character findCharacter(String str){
        Set<Character> s = new HashSet<>();
        for (Character c :str.toCharArray()){
            if(!s.add(c)){
                return c;
            }
        }
        return null;
    }
}
