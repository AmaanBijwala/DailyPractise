public class ReverseDegreeOfString {
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }
    public static  int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(i+1)*('z'-s.charAt(i)+1);
        }
        return sum;
    }
}
/*
3498. Reverse Degree of a String

Given a string s, calculate its reverse degree.
The reverse degree is calculated as follows:
For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
Sum these products for all characters in the string.
Return the reverse degree of s.


Example 1:
Input: s = "abc"
Output: 148
Explanation:
Letter	Index_inReversed_Alphabet	Index_in_String	 Product
'a'	    26	                            1	            26
'b'	    25	                            2	            50
'c'	    24	                            3	            72
The reversed degree is 26 + 50 + 72 = 148.
 */