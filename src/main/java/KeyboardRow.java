import java.util.*;

public class KeyboardRow {
    public static void main(String args[]) {
        String[] s={"Hello","Alaska","Dad","Peace"};
        printStringArray(findWords(s));
    }

        public static String[] findWords(String[] words) {
            List<String>l=new LinkedList<>();
            String s1="qwertyuiopQWERTYUIOP";
            String s2="asdfghjklASDFGHJKL";
            String s3="zxcvbnmZXCVBNM";

            for(String s: words){
                boolean addtoListS1=true;
                boolean addtoListS2=true;
                boolean addtoListS3=true;
                for(Character c:s.toCharArray()){
                    if(s1.indexOf(c)==-1){
                        addtoListS1=false;
                        break;
                    }
                }
                for(Character c:s.toCharArray()){
                    if(s2.indexOf(c)==-1){
                        addtoListS2=false;
                        break;
                    }
                }
                for(Character c:s.toCharArray()){
                    if(s3.indexOf(c)==-1){
                        addtoListS3=false;
                        break;
                    }
                }
                if(addtoListS1 || addtoListS2 || addtoListS3)
                    l.add(s);
            }
            String[] res=new String[l.size()];
            int i=0;
            for(String s:l){
                res[i++]=s;
            }
            return res;
        }
    public static void printStringArray(String[] s){
        for(String str:s){
            System.out.print(str+" ");
        }
    }
}


/*
500. Keyboard Row

Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.
In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Explanation:
Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).

 */