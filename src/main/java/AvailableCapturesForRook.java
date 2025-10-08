
public class AvailableCapturesForRook {



    public static  int numRookCaptures(char[][] board) {
        int arr[]=findIndex(board);
        int count=0;
        int r=arr[0];
        int c=arr[1];
        for(int i=r+1;i<8;i++){
            if(board[i][c]=='B') break;
            if(board[i][c]=='p'){
                count++;
                break;
            }
        }
        for(int i=r-1;i>=0;i--){
            if(board[i][c]=='B') break;
            if(board[i][c]=='p'){
                count++;
                break;
            }
        }
        for(int i=c+1;i<8;i++){
            if(board[r][i]=='B') break;
            if(board[r][i]=='p'){
                count++;
                break;
            }
        }
        for(int i=c-1;i>=0;i--){
            if(board[r][i]=='B') break;
            if(board[r][i]=='p'){
                count++;
                break;
            }
        }
        return count;
    }
    public static int[] findIndex(char[][] board) {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R')
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }



}


/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0

Constraints:
0 <= num <= 231 - 1
Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */