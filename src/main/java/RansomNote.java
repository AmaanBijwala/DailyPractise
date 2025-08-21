
import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        if (m > n)
            return false;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for (Character c : ransomNote.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        for (Character c : magazine.toCharArray()) {
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> v : m1.entrySet()) {
            Character key = v.getKey();
            if (m2.containsKey(key) && (m2.get(key) >= m1.get(key))) {

            } else {
                return false;
            }
        }
        return true;
    }
}
/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3
Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */