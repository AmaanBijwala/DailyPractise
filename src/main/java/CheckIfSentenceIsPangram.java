import java.util.HashSet;
import java.util.Set;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        Set<Character> s=new HashSet<>();
        for(Character c:sentence.toCharArray()){
            s.add(c);
        }
        return s.size()==26;
    }
}

/*
1832. Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false

Constraints:
1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */