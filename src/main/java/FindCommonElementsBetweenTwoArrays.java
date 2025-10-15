
import java.util.*;
public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args)
    {
        int[] nums1={2,3,2};
        int[] nums2={1,2};
        printArray(findIntersectionValues(nums1,nums2));
    }



    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res1=0;
        int res2=0;
        int m=nums1.length;
        int n=nums2.length;
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int i=0;i<Math.max(m,n);i++){
            if(i<m)
                s1.add(nums1[i]);
            if(i<n)
                s2.add(nums2[i]);
        }
        for(int i=0;i<Math.max(m,n);i++){
            if(i<m){
                if(s2.contains(nums1[i]))
                    res1++;
            }
            if(i<n){
                if(s1.contains(nums2[i]))
                    res2++;
            }
        }
        return new int[]{res1,res2};
    }

    public static void printArray(int [] res){
        System.out.print("[");
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }

}
