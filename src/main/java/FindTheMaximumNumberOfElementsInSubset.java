
import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String  key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char currChar = 'a';
        for(int i=0;i<key.length();i++)
        {
            char ch = key.charAt(i);
            if(ch != ' ' && !map.containsKey(ch))
            {
                map.put(ch,currChar++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            if(ch == ' ')
            {
                sb.append(' ');
            }
            else
            {
                sb.append(map.get(ch));
            }
        }
        return sb.toString();
    }

}
/*
2325. Decode the Message

You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

Example 1:
Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 */