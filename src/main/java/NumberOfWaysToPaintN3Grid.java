import java.util.Arrays;

class NumberOfWaysToPaintN3Grid {

        int M = 1000000007;

        String[] states = {
                "RYG", "RGY", "RYR", "RGR",
                "YRG", "YGY", "YGR", "YRY",
                "GRY", "GYR", "GRG", "GYG"
        };

        int[][] memo;  // DP memo table
        int n;

        public int numOfWays(int n) {
            this.n = n;
            memo = new int[n][12];  // row, lastPattern
            for (int i = 0; i < n; i++)
                Arrays.fill(memo[i], -1);

            long result = 0;

            // Try all 12 possible patterns for the first row
            for (int p = 0; p < 12; p++) {
                result = (result + solve(1, p)) % M;
            }
            return (int) result;
        }

        // row = current row index, prev = pattern id of previous row
        private int solve(int row, int prev) {
            if (row == n)
                return 1;

            if (memo[row][prev] != -1)
                return memo[row][prev];

            long ways = 0;
            String last = states[prev];

            for (int curr = 0; curr < 12; curr++) {
                String currPat = states[curr];
                boolean conflict = false;

                // Check vertical conflict
                for (int c = 0; c < 3; c++) {
                    if (currPat.charAt(c) == last.charAt(c)) {
                        conflict = true;
                        break;
                    }
                }

                if (!conflict) {
                    ways = (ways + solve(row + 1, curr)) % M;
                }
            }

            memo[row][prev] = (int) ways;
            return memo[row][prev];
        }
    }
