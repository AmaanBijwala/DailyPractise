
import java.util.Arrays;

public class MaximizeHappinessOfSelectedChildren {
    public static void main(String[] args) {
        int[] happiness={1,2,3};
        int k=2;
        System.out.println(maximumHappinessSum(happiness,k));
    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        long res=0;
        Arrays.sort(happiness);
        int p=0;
        int n=happiness.length;
        for(int i=n-1;i>=0 && p < k;i--){
            if(happiness[i]-p<=0 )
                break;
            res+=(happiness[i]-p);
            p++;
        }
        return res;
    }
}