
import java.util.*;

public class MinimumDistanceBetweenThreeEqualElementsII {

    public int minimumDistance(int[] nums) {
        int res=Integer.MAX_VALUE;
        Map<Integer,List<Integer>>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                List<Integer>l=m.get(nums[i]);
                l.add(i);
                m.put(nums[i],l);
            }
            else{
                List<Integer>l=new ArrayList<>();
                l.add(i);
                m.put(nums[i],l);
            }

        }
        for(Map.Entry<Integer,List<Integer>> mp:m.entrySet()){
            List<Integer>l=mp.getValue();
            int size=l.size();
            if(l.size()>=3){
                for (int i = 0; i <= size - 3; i++) {
                    res = Math.min(res, 2 * (l.get(i + 2) - l.get(i)));
                }
            }
        }
        return res!=Integer.MAX_VALUE?res:-1;
    }
}