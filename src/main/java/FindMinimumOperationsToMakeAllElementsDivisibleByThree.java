import java.util.*;
import java.util.stream.IntStream;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        return (int) IntStream.of(nums).filter(no->no%3!=0).count();
    }



}
