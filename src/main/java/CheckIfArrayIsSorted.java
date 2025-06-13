import java.util.*;
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(isSorted(a));
    }
    static boolean isSorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                return false;
            }
        }
        return true;
    }
}
