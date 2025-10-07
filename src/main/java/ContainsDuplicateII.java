
import java.util.*;
public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>m=new HashMap<>();
        Set<Integer>s=new HashSet<>();
        for( int i=0;i<nums.length;i++ ){
            if(!s.add(nums[i])){
                int index =m.get(nums[i]);
                if(Math.abs(i-index)<=k)
                    return true;
            }
            m.put(nums[i],i);
        }
        return false;
    }


}

