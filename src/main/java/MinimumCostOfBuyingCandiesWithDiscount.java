
import java.util.*;
public class MinimumCostOfBuyingCandiesWithDiscount {

    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        if(n==1)
            return cost[0];
        if(n==2)
            return cost[0]+cost[1];
        int sum=0;
        for(int i=n-1;i>=0;i-=3){
            sum+=cost[i];
            if(i-1>=0)
                sum+=cost[i-1];
        }
        return sum;
    }
}