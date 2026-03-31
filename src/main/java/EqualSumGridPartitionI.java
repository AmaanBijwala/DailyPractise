class EqualSumGridPartitionI {

        public boolean canPartitionGrid(int[][] grid) {
            int m = grid.length;       // rows
            int n = grid[0].length;    // cols

            long total = 0;
            long[] rowSum = new long[m];
            long[] colSum = new long[n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    rowSum[i] += grid[i][j];
                    colSum[j] += grid[i][j];
                    total += grid[i][j];
                }
            }

            // Check horizontal cuts (between row i and i+1)
            long prefixRow = 0;
            for (int i = 0; i < m - 1; i++) {  // m-1: both sections must be non-empty
                prefixRow += rowSum[i];
                if (prefixRow == total - prefixRow)
                    return true;
            }

            // Check vertical cuts (between col j and j+1)
            long prefixCol = 0;
            for (int j = 0; j < n - 1; j++) {  // n-1: both sections must be non-empty
                prefixCol += colSum[j];
                if (prefixCol == total - prefixCol)
                    return true;
            }

            return false;
        }
    }