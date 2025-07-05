import java.util.LinkedHashMap;
import java.util.Map;

public class MostFreqVowelAndConsonent {
    public static void main(String[] args) {
        System.out.println(maxFreqSum("successes"));
    }

    public static int maxFreqSum(String s) {
        Map<Character,Integer> m=new LinkedHashMap<>();
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
/*
3541. Find Most Frequent Vowel and Consonant
You are given a string s consisting of lowercase English letters ('a' to 'z').
Your task is to:
Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.
Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.
The frequency of a letter x is the number of times it occurs in the string.

Example 1:
Input: s = "successes"
Output: 6
Explanation:
The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.

* */