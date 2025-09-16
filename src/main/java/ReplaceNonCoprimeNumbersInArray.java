import java.util.*;
public class ReplaceNonCoprimeNumbersInArray {
    public static void main(String[] args) {
        int[] nums={6,4,3,2,7,6,2};
        System.out.println(replaceNonCoprimes(nums));
    }


    public static List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Long> stack = new ArrayDeque<>();

        for (int num : nums) {
            long current = num;

            // Merge with stack top while non-coprime
            while (!stack.isEmpty() && gcd(stack.peek(), current) > 1) {
                long top = stack.pop();
                current = lcm(top, current);
            }

            stack.push(current);
        }

        // Reverse the stack to get correct order
        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(0, stack.pop().intValue());
        }

        return result;
    }

    private static  long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }


}
