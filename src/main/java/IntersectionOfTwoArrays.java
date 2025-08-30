import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        printArray(intersection(nums1,nums2));
    }
        public static int[] intersection(int[] nums1, int[] nums2) {
            List<Integer>l1=new ArrayList<>();
            List<Integer>l2=new ArrayList<>();
            for(int i:nums1){
                if(!l1.contains(i)){
                    l1.add(i);
                }
            }
            for(int i:nums2){
                if(l1.contains(i) && !l2.contains(i)){
                    l2.add(i);
                }
            }
            int n=l2.size();
            int [] res=new int[n];
            for(int i=0;i<n;i++){
                res[i]=l2.get(i);
            }
            return res;

        }
    static void printArray(int [] a){
        for(int i:a) {
            System.out.print(i+",");
        }
    }

}
/*
349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/