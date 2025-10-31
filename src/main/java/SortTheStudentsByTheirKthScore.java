import java.util.*;
public class SortTheStudentsByTheirKthScore {
    public static void main(String[] args)
    {
        int[][] score={{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k=2;
        printArray(sortTheStudents(score,k));
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer,int []>m=new HashMap<>();
        int j=0;
        int res[]=new int[score.length];
        for(int i=0;i<score.length;i++){
            int no=score[i][k];
            m.put(no,score[i]);
            res[j++]=no;
        }
        Arrays.sort(res);
        int t=score.length-1;
        for(int i:res){
            score[t--]=m.get(i);
        }
        return score;
    }
    public static void printArray(int[][] result){
        for(int[] i: result){
            for(int j:i)
                System.out.print(j+" ");
        }
    }

}
