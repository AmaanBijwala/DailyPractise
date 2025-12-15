
import java.util.Arrays;

public class NumberOfSmoothDescentPeriodsOfAStock {
    public static void main(String[] args) {
        int[] nums={3,2,1,4};
        System.out.println(getDescentPeriods(nums));
    }
        public static long getDescentPeriods(int[] prices) {
            long ans = 1, count = 1;
            for(int i = 0; i < prices.length - 1; i++) {
                if(prices[i] == prices[i + 1] + 1) count++;
                else count = 1;
                ans += count;
            }
            return ans;
        }
    }