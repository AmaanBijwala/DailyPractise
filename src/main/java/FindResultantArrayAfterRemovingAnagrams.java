import java.util.*;
public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args)
    {
        String[] words={"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }


        public static  List<String> removeAnagrams(String[] words) {
            List<String> l=new ArrayList<>();
            int n=words.length;
            l.add(words[0]);
            for(int i=1;i<n;i++){
                if(!isAnagram(words[i-1],words[i]) ){
                    l.add(words[i]);
                }
            }
            return l;
        }
        public static boolean isAnagram(String s1,String s2){
            if(s1.length()!=s2.length())
                return false;
            StringBuilder sb=new StringBuilder(s1);
            for(Character c:s2.toCharArray()){
                int index=sb.indexOf(c.toString());
                if(index==-1){
                    return false;
                }
                sb.deleteCharAt(index);
            }
            return sb.length()==0;
        }




}
