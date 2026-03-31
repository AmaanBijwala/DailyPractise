import java.util.Arrays;
import java.util.List;

public class FlipSquareSubmatrixVertically {
        public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
            int top = x;
            int bot = x + k - 1;

            while(top < bot) {
                // swap elements column by column within y to y+k-1
                for(int j = y; j < y + k; j++) {
                    int temp = grid[top][j];
                    grid[top][j] = grid[bot][j];
                    grid[bot][j] = temp;
                }
                top++;
                bot--;
            }
            return grid;
        }
    }

