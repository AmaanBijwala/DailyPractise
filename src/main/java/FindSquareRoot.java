
public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(7));
    }

    public static int mySqrt(int x) {
        if(x==0 || x==1)
            return x;
        int l=0;
        int h=x;
        int prev=0;
        while(l<=h){
            int m= l+(h-l)/2;
            long res=(long)m*m;
            if(res==x){
                return m;
            }
            else if(res<x){
                l=m+1;
                if(prev ==l){
                    return prev;
                }
                prev=m;
            }
            else if(res>x){
                h=m-1;
            }
        }
        return prev;
    }

}

/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
Constraints:
0 <= x <= 231 - 1
 */