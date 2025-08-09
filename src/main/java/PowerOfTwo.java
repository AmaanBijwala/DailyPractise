
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(45));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n==1 ||n==2)
            return true;
        int l=0;
        int r=n;
        while(l<=r){
            int m=l+(r-l)/2;
            if(Math.pow(2,m)==n){
                return true;
            }
            else if(Math.pow(2,m)>n){
                r=m-1;
            }
            else
                l=m+1;
        }
        return false;
    }

}


/*
231. Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:
Input: n = 3
Output: false


Constraints:
-231 <= n <= 231 - 1
 */