import java.util.*;
public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int N=5;
        System.out.println(fibonacci(N));
    }
    static int fibonacci(int N){
        if(N<=1)
            return N;
        return fibonacci(N-1)+fibonacci(N-2);
    }
}
