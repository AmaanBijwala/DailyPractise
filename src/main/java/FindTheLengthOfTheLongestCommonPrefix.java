

import java.util.*;

public class FindTheLengthOfTheLongestCommonPrefix {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer>s=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int n=arr1[i];
            while(n>0){
                s.add(n);
                n/=10;
            }
        }
        for(int i=0;i<arr2.length;i++){
            int n=arr2[i];
            while(n>0){
                if(s.contains(n)){
                    count=Math.max(count,(int)Math.log10(n)+1);
                    break;
                }
                n/=10;
            }
        }
        return count;
    }
}