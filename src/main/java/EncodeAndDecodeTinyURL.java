
import java.util.*;
public class EncodeAndDecodeTinyURL {
    static final String chars="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Map<String,String>encodeMap=new HashMap<>();    // f,s
    Map<String,String>decodeMap=new HashMap<>();   // s,f
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(encodeMap.containsKey(longUrl))
            return encodeMap.get(longUrl);

        String encodedString=getUniqueCode();
        while(decodeMap.containsKey(encodedString)){
            encodedString=getUniqueCode();
        }
        decodeMap.put(encodedString,longUrl);
        encodeMap.put(longUrl,encodedString);
        System.out.println("Return Encoded String as "+encodedString);
        return encodedString;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        System.out.println("Return Decoded String as "+decodeMap.get(shortUrl));
        return decodeMap.get(shortUrl);
    }

    //get Unique Code
    public String getUniqueCode(){
        char [] c=new char[6];
        for(int i=0;i<6;i++){
            c[i]=chars.charAt((int)(Math.random()*62));
        }
        return "http://tinyurl.com/"+String.valueOf(c);
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

/*
535. Encode and Decode TinyURL
Note: This is a companion problem to the System Design problem: Design TinyURL.
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.
There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
Implement the Solution class:

Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.

Example 1:
Input: url = "https://leetcode.com/problems/design-tinyurl"
Output: "https://leetcode.com/problems/design-tinyurl"
Explanation:
Solution obj = new Solution();
string tiny = obj.encode(url); // returns the encoded tiny url.
string ans = obj.decode(tiny); // returns the original url after decoding it.

Constraints:
1 <= url.length <= 104
url is guranteed to be a valid URL.
 */