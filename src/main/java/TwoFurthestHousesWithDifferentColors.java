

public class TwoFurthestHousesWithDifferentColors {

    public int maxDistance(int[] colors) {
        int n=colors.length;
        int k=n;
        int start=colors[0];
        int end=colors[n-1];
        int i=0;
        int lCount=0;
        int rCount=0;
        while(n>=0){
            if(start!=colors[n-1]){
                lCount= n-1;
                break;
            }
            n--;
        }
        while(i<k){
            if(end!=colors[i]){
                rCount= k-i-1;
                break;
            }
            i++;
        }
        return Math.max(lCount,rCount);
    }
}