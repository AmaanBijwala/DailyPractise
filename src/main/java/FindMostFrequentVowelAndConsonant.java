
import java.util.*;

public class FindMostFrequentVowelAndConsonant {
    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }


        public static int maxFreqSum(String s) {
            Map<Character,Integer>m=new LinkedHashMap<>();
            int vMax=0;
            int cMax=0;
            for(Character c: s.toCharArray()){
                m.put(c,m.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer>v:m.entrySet()){
                char c=v.getKey();
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
                    vMax=Math.max(vMax,v.getValue());
                }else{
                    cMax=Math.max(cMax,v.getValue());
                }
            }
            return vMax+cMax;
        }

}
