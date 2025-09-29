import java.util.*;
import java.util.List;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words={"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }


        public static int uniqueMorseRepresentations(String[] words) {
            String[] morse = {".-","-...","-.-.","-..",".","..-.",
                    "--.","....","..",".---","-.-",".-..",
                    "--","-.","---",".--.","--.-",".-.",
                    "...","-","..-","...-",".--","-..-",
                    "-.--","--.."};
            List<String> list=new ArrayList<>();
            for(String word:words){
                StringBuilder code=new StringBuilder();
                for(char c:word.toCharArray()){
                    code.append(morse[c-'a']);
                }
                String morseWord=code.toString();
                if(!list.contains(morseWord)){
                    list.add(morseWord);
                }
            }
            return list.size();
        }


}
