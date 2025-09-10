
import java.util.*;

public class MinimumNumberOfPeopleToTeach {
    public static void main(String[] args) {
        int languages[][]={{1},{2},{1,2}};
        int friendships[][]={{1,2},{1,3},{2,3}};
        int n=2;
        System.out.println(minimumTeachings(n,languages,friendships));
    }

    public static int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> sadUser=new HashSet<>();

        for(int[] i:friendships){
            int u=i[0]-1;
            int v=i[1]-1;
            Set<Integer> langSet=new HashSet<>();

            for(int j:languages[u]){
                langSet.add(j);
            }
            boolean isLangKnown=false;
            for(int j:languages[v]){
                if(langSet.contains(j)){
                    isLangKnown=true;
                    break;
                }
            }
            if(!isLangKnown){
                sadUser.add(u);
                sadUser.add(v);
            }

        }
        Map<Integer,Integer>langCount=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i:sadUser){
            for(int j:languages[i]){
                langCount.put(j,langCount.getOrDefault(j,0)+1);
                max=Math.max(langCount.get(j),max);
            }
        }
        return sadUser.isEmpty()?0:sadUser.size()-max;
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
