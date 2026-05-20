
import java.util.HashSet;
import java.util.Set;
public class FindThePrefixCommonArrayOfTwoArrays {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        int m=A.length;
        int n=B.length;
        int C[]=new int [n];
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!s.add(A[i]))
                count++;
            if(!s.add(B[i]))
                count++;
            C[i]=count;
        }
        return C;
    }
}