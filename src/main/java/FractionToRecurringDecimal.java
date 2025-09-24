import java.util.*;
public class FractionToRecurringDecimal {
    public static void main(String[] args)
    {

        System.out.println(fractionToDecimal(5,7));
    }


        public static String fractionToDecimal(int numerator, int denominator) {
            if(numerator==0)
                return "0";
            if(denominator==1)
                return String.valueOf(numerator);
            boolean isNegative=(numerator>0)^(denominator>0);
            long num = Math.abs((long) numerator);
            long deno = Math.abs((long) denominator);
            StringBuilder sb=new StringBuilder();
            if(isNegative)
                sb.append("-");
            Map<Long,Integer>m=new HashMap<>();
            long q=num/deno;
            sb.append(q);
            long remainder=num%deno;
            if(remainder!=0)
                sb.append(".");
            while(remainder!=0){
                if(m.containsKey(remainder)){
                    int index = m.get(remainder);
                    sb.insert(index, "(");
                    sb.append(")");
                    break;
                }
                m.put(remainder,sb.length());
                remainder*=10;
                sb.append(remainder/deno);
                remainder=remainder%deno;
            }
            return sb.toString();
        }




}


/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

Constraints:
0 <= num <= 231 - 1
Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */