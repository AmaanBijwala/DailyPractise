
import java.util.*;

public class VowelSpellchecker {
    public static void main(String[] args) {
        String[] wordlist={"KiTe","kite","hare","Hare"};
        String[] queries={"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
        printArray(spellchecker(wordlist,queries));
    }

    public static String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> set=new HashSet<>(Arrays.asList(wordlist));
        int queryLength=queries.length;
        String res[]=new String[queryLength];
        int index=0;
        for(String q: queries){
            if(set.contains(q)){
                res[index++]=q;
                continue;
            }

            String caseMatch=null;
            for(String w: wordlist){
                if(w.equalsIgnoreCase(q)){
                    caseMatch=w;
                    break;
                }
            }
            if(caseMatch!=null){
                res[index++]=caseMatch;
                continue;
            }

            String vowelMatch=null;
            for(String w: wordlist){
                if(w.length()!=q.length()){
                    continue;
                }
                boolean match=true;
                for(int i=0;i<w.length();i++){
                    char qc=Character.toLowerCase(q.charAt(i));
                    char wc=Character.toLowerCase(w.charAt(i));
                    if(qc!=wc){
                        if(!(isVowel(qc) && isVowel(wc))){
                            match=false;
                            break;
                        }
                    }
                }
                if(match){
                    vowelMatch=w;
                    break;
                }
            }
            if(vowelMatch!=null){
                res[index++]=vowelMatch;
            }
            else{
                res[index++]="";
            }
        }
        return res;
    }
    public static boolean isVowel(char c){
        return "aeiou".indexOf(c)>=0;
    }
    public static void printArray(String[] res){
        System.out.print("{");
        for(String s:res){
            System.out.print(s+" , ");
        }
        System.out.print("}");
    }
}
