
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int low=3;
        int high=7;
        System.out.println(countOdds(low,high));
    }

    public static int countOdds(int low, int high) {
    /* low = 2, high = 4    2 3 4        1
       low = 2, high = 5    2 3 4 5      2
       low = 3, high = 6    3 4 5 6      2
       low = 3, high = 7    3 4 5 6 7    3
       0          10         0 1 2 3 4 5 6 7 8 9 10
       */
        if(high%2==0)
            high--;
        if(low%2==0)
            low++;
        return ((high-low)/2)+1;
    }
}
