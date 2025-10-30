

import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfIncrementsOnSubarraysToFormATargetArray {
    public static void main(String[] args)
    {
        int[] target={1,2,3,2,1};
        System.out.println(minNumberOperations(target));
    }
    public static int minNumberOperations(int[] target) {
        int n = target.length;
        int operations = target[0]; // start with first element

        for (int i = 1; i < n; i++) {
            if (target[i] > target[i - 1]) {
                operations += target[i] - target[i - 1];
            }
        }
        return operations;
    }

}