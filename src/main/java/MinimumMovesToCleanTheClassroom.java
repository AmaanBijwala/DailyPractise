
import java.util.*;
public class FirstNonRepetitiveCharacter {
    public static void main(String[] args) {
        char [] a={'a','b','c','c','a','d'};
        Map<Character,Integer>m=new LinkedHashMap<>();
        for(Character c:a){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>v:m.entrySet()){
            if(v.getValue()==1){
                System.out.println(v.getKey());
                return;
            }
        }
    }
}
