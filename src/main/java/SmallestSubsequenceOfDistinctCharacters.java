
import java.util.Arrays;

public class FindMinUsingStream {
    public static void main(String[] args) {
        int[] a = {7,8,5,7,9,5};
        int min=Arrays.stream(a).reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
        System.out.println("The minimum no is "+min);
    }
}
