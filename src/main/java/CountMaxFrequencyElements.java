
import java.util.*;
// Definition for singly-linked list.
public class CountMaxFrequencyElements {

    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int res=0;
        Map<Integer,Integer>m=new HashMap<>();
        for(int no:nums){
            int freq=m.getOrDefault(no,0);
            m.put(no,freq+1);
            max=Math.max(max,freq+1);
        }
        for(Map.Entry<Integer,Integer>v:m.entrySet()){
            if(v.getValue()==max){
                res+=max;
            }
        }
        return res;

    }
}

