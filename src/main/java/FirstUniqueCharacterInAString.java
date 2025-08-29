import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

        public static int firstUniqChar(String s) {
            Map<Character,Integer>m=new LinkedHashMap<>();
            for(Character c:s.toCharArray()){
                m.put(c,m.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer>v:m.entrySet()){
                if(v.getValue()==1){
                    return s.indexOf(v.getKey());
                }
            }
            return -1;
        }

}

/*
387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1


Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.
 */