import java.util.Arrays;
import java.util.List;

public class LargestMagicSquare {

        public int largestMagicSquare(int[][] grid) {
            int rows=grid.length;
            int cols=grid[0].length;
            int[][] rowCumSum  =new int[rows][cols];
            int[][] colCumSum  =new int[rows][cols];
            for(int i=0;i<rows;i++){
                rowCumSum[i][0]=grid[i][0];
                for(int j=1;j<cols;j++){
                    rowCumSum[i][j]=rowCumSum[i][j-1]+grid[i][j];
                }
            }
            for(int j=0;j<cols;j++){
                colCumSum[0][j]=grid[0][j];
                for(int i=1;i<rows;i++){
                    colCumSum[i][j]=colCumSum[i-1][j]+grid[i][j];
                }
            }

            for(int side=Math.min(rows,cols);side>=2;side--){
                for(int i=0;i+side-1<rows;i++){
                    for(int j=0;j+side-1<cols;j++){

                        int targetSum=rowCumSum[i][j+side-1]-(j>0?rowCumSum[i][j-1]:0);
                        boolean allSame=true;
                        for(int r=i+1;r<i+side;r++){
                            int rowSum=rowCumSum[r][j+side-1]-(j>0?rowCumSum[r][j-1]:0);
                            if(rowSum!=targetSum){
                                allSame=false;
                                break;
                            }
                        }
                        if(!allSame)
                            continue;
                        for(int c=j;c<j+side;c++){
                            int colSum=colCumSum[i+side-1][c]-(i>0?colCumSum[i-1][c]:0);
                            if(colSum!=targetSum){
                                allSame=false;
                                break;
                            }
                        }
                        if(!allSame)
                            continue;
                        int diagSum=0;
                        int antiDiagSum=0;
                        for(int k=0;k<side;k++){
                            diagSum+=grid[i+k][j+k];
                            antiDiagSum+=grid[i+k][j+side-1-k];
                        }
                        if(diagSum==targetSum && antiDiagSum==targetSum){
                            return side;
                        }
                    }
                }
            }
            return 1;
        }
    }