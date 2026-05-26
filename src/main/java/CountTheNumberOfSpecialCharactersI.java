
import java.util.*;
public class CountTheNumberOfSpecialCharactersI {


    public int numberOfSpecialChars(String word) {
        Set<Character>s=new HashSet<>();
        int count=0;
        for(Character c:word.toCharArray()){
            if(s.contains(c))
                continue;
            if(Character.isLowerCase(c)){
                if(word.indexOf(Character.toUpperCase(c))!=-1){
                    count++;
                }
            }
            s.add(c);
        }
        return count;
    }
}
