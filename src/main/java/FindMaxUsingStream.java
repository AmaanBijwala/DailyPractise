import java.util.*;
import java.util.Arrays;

public class FindMaxUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 4, 3, 4};
        int max=Arrays.stream(arr).reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max number is "+max);
    }
}
