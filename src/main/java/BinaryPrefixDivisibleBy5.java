
import java.util.*;
public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] args) {
        int[] nums={0,1,1};
        System.out.println(prefixesDivBy5(nums));
    }


    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val = 0;

        for (int n : nums) {
            val = ((val << 1) + n) % 5;
            res.add(val == 0);
        }

        return res;
    }
}



