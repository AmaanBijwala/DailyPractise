/*Print Spiral Array
*/
import java.util.*;
public class SpiralArray {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};

        int l=0;
        int t=0;
        int b=a.length-1;
        int r=a[0].length-1;
        List<Integer>d=new ArrayList<>();

        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){d.add(a[t][i]);}t++;
            for(int i=t;i<=b;i++){d.add(a[i][r]);}r--;
            for(int i=r;i>=l;i--){d.add(a[b][i]);}b--;
            for(int i=b;i>=t;i--){d.add(a[i][l]);}l++;
        }
        System.out.println("Spiral array is "+d);
    }

}
