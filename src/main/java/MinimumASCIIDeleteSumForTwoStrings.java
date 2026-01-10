import java.util.Arrays;

public class MinimumASCIIDeleteSumForTwoStrings {

        public int dp(int i, int j, String s1, String s2, int[][] dp, int[] sum1, int[] sum2) {
            if(i<0 && j<0) return 0;
            if(i<0) return sum2[j];
            if(j<0) return sum1[i];
            if(dp[i][j] != -1) return dp[i][j];

            if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = dp(i-1,j-1,s1,s2,dp,sum1,sum2);
            return dp[i][j] = Math.min(
                    s1.charAt(i) + dp(i-1,j,s1,s2,dp,sum1,sum2),
                    s2.charAt(j) + dp(i,j-1,s1,s2,dp,sum1,sum2)
            );
        }
        public int[] prefill(String s) {
            int[] sum = new int[s.length()];
            sum[0] = s.charAt(0);
            for(int i=1;i<s.length();i++)
                sum[i] = sum[i-1] + s.charAt(i);
            return sum;
        }
        public int minimumDeleteSum(String s1, String s2) {
            int n = s1.length(),m=s2.length();
            int[][] dp = new int[n][m];
            int[] sum1 = prefill(s1);
            int[] sum2 = prefill(s2);
            for(int i=0;i<n;i++)
                Arrays.fill(dp[i],-1);
            return dp(n-1,m-1,s1,s2,dp,sum1,sum2);
        }
    }