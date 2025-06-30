
import java.util.LinkedList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> res=kidsWithCandies(candies,extraCandies);
        System.out.println(res);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean>l=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        for(int i:candies){
            if(max<i)
                max=i;
        }
        for(int i=-0;i<n;i++){
            if(candies[i]+extraCandies<max)
                l.add(false);
            else
                l.add(true);
        }
        return l;
    }

}
/*
1431. Kids With the Greatest Number of Candies

You are given an array of integers nums and an integer target.

Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.



Example 1:

Input: nums = [3,5,6,7], target = 9
Output: 4
Explanation: There are 4 subsequences that satisfy the condition.
[3] -> Min value + max value <= target (3 + 3 <= 9)
[3,5] -> (3 + 5 <= 9)
[3,5,6] -> (3 + 6 <= 9)
[3,6] -> (3 + 6 <= 9)

* */