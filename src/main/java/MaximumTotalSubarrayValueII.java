

import java.util.*;

public class MinimumAbsoluteDifferenceInSlidingSubmatrix {

    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int [][] ans =new int[m-k+1][n-k+1];

        for(int i=0;i+k<=m;i++){
            for(int j=0;j+k<=n;j++){
                TreeSet<Integer> s = new TreeSet<>();
                for(int r=i;r<i+k;r++){
                    for(int c=j;c<j+k;c++){
                        s.add(grid[r][c]);
                    }
                }

                ans[i][j]=computeMinAbsDiff(s);
            }
        }
        return ans;
    }
    public int computeMinAbsDiff(TreeSet<Integer> set) {
        if (set.size() == 1) return 0;
        int min = Integer.MAX_VALUE;
        Integer prev = null;
        for (int val : set) {
            if (prev != null) min = Math.min(min, val - prev);
            prev = val;
        }
        return min;
    }
}