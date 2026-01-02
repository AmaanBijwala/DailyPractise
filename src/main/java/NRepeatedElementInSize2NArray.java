
import java.util.*;

public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            if(!s.add(i))
                return i;
        }
        return 0;
    }
}