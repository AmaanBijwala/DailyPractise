

import java.util.Arrays;
import java.util.List;

public class MagicSquaresInGrid {

    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i + 2 < m; i++) {
            for (int j = 0; j + 2 < n; j++) {
                if (isMagic(grid, i, j))
                    count++;
            }
        }
        return count;
    }

    private boolean isMagic(int[][] g, int r, int c) {
        // Center must be 5
        if (g[r+1][c+1] != 5) return false;

        // All numbers must be 1–9 and distinct
        boolean[] seen = new boolean[10];
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                int val = g[i][j];
                if (val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }
        }

        // Check sums: every row/col/diag must sum to 15
        int sum = g[r][c] + g[r][c+1] + g[r][c+2];

        // rows
        if (g[r+1][c] + g[r+1][c+1] + g[r+1][c+2] != sum) return false;
        if (g[r+2][c] + g[r+2][c+1] + g[r+2][c+2] != sum) return false;

        // cols
        if (g[r][c] + g[r+1][c] + g[r+2][c] != sum) return false;
        if (g[r][c+1] + g[r+1][c+1] + g[r+2][c+1] != sum) return false;
        if (g[r][c+2] + g[r+1][c+2] + g[r+2][c+2] != sum) return false;

        // diagonals
        if (g[r][c] + g[r+1][c+1] + g[r+2][c+2] != sum) return false;
        if (g[r][c+2] + g[r+1][c+1] + g[r+2][c] != sum) return false;

        return true;
    }
}
