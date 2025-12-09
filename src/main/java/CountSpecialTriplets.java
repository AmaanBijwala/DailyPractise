import java.util.*;

public class CountSpecialTriplets {
    public static void main(String[] args)
    {
        int[] nums={6,3,6};
        System.out.println(specialTriplets(nums));
    }

        public static int specialTriplets(int[] nums) {
            int n = nums.length;
            long MOD = 1_000_000_007;

            Map<Integer, Integer> right = new HashMap<>();
            Map<Integer, Integer> left = new HashMap<>();

            // Fill right map
            for (int x : nums) {
                right.put(x, right.getOrDefault(x, 0) + 1);
            }

            long ans = 0;

            for (int j = 0; j < n; j++) {
                int mid = nums[j];

                // Remove current from right
                right.put(mid, right.get(mid) - 1);

                // Count valid i < j where nums[i] = mid * 2
                int need = mid * 2;
                long countI = left.getOrDefault(need, 0);

                // Count valid k > j where nums[k] = mid * 2
                long countK = right.getOrDefault(need, 0);

                ans = (ans + countI * countK) % MOD;

                // Add current to left
                left.put(mid, left.getOrDefault(mid, 0) + 1);
            }

            return (int) ans;
        }
    }


