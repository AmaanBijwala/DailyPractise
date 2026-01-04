import java.util.ArrayList;

public class FourDivisors {


        public int sumFourDivisors(int[] nums) {
            int total = 0;

            for (int n : nums) {
                total += getFourDivisorSum(n);
            }

            return total;
        }

        private int getFourDivisorSum(int n) {
            int sum = 0, count = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int j = n / i;

                    if (i == j) { // perfect square divisor
                        count++;
                        sum += i;
                    } else {
                        count += 2; // i and j are two divisors
                        sum += i + j;
                    }
                }

                if (count > 4) return 0; // early exit
            }

            return count == 4 ? sum : 0;
        }
    }
