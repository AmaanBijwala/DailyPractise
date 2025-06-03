/*i/p  ("AA", "BB", "AA", "CC")
  o/p  {AA=2}

*/
import java.util.*;
public class CountFreqOfString {

    public static void main(String[] args) {
        String[] strArray = {"AA", "BB", "AA", "CC"};
        Map<String, Integer> freMap = new LinkedHashMap<>();
        for (String s : strArray) {
            freMap.put(s,freMap.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer>m:freMap.entrySet()){
            if(m.getValue()>1){
                System.out.println("{"+m.getKey()+"="+m.getValue()+"}");
                return;
            }
        }
    }
}
