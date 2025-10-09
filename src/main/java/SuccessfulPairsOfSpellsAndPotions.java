
import java.util.*;
public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args)
    {
        int[] spells={5,1,3};
        int[] potions={1,2,3,4,5};
        long success=7;
        printArray(successfulPairs(spells, potions, success));
    }

    public static  int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int[] res=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            res[i]=findCount(spells[i],potions,success);
        }
        return res;
    }
    public static int findCount(int no,int[] potions,long success){
        int ans=potions.length;
        int l=0;
        int r=potions.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)potions[mid]*(long)no>=success){
                r=mid-1;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return potions.length-ans;
    }
    public static void printArray(int[] result){
        for(int i: result){
            System.out.print(i+" ");
        }
    }


}
