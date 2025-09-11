import java.util.*;

public class SortVowelsInAString {

    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }


        public static String sortVowels(String s) {
            List<Character> l=new ArrayList<>();
            List<Integer> indices=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                char currChar=s.charAt(i);
                if(currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u' ||
                        currChar == 'A' || currChar == 'E' || currChar == 'I' || currChar == 'O' || currChar == 'U'    ){
                    l.add(currChar);
                    indices.add(i);
                }
            }
            l.sort(null);
            int u=0;
            StringBuilder sb=new StringBuilder(s);
            for(int i: indices){
                sb.setCharAt(i,l.get(u));
                u++;
            }
            return sb.toString();
        }



}
