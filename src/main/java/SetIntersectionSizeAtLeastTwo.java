import java.util.*;
public class SetIntersectionSizeAtLeastTwo {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{3,7},{8,9}};
        System.out.println(intersectionSizeTwo(intervals));
    }
    public static  int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });

        List<Integer> nums = new ArrayList<>();
        int cnt = 0;

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            int count = 0;

            for (int i = nums.size() - 1; i >= 0; i--) {
                if (nums.get(i) >= start && nums.get(i) <= end) {
                    count++;
                    if (count == 2) break;
                }
            }

            if (count == 0) {
                nums.add(end - 1);
                nums.add(end);
                cnt += 2;
            } else if (count == 1) {
                nums.add(end);
                cnt += 1;
            }
        }

        return cnt;
    }
}
