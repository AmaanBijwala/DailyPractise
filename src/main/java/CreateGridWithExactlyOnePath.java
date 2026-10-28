import java.util.*;
public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apple={1,3,2};
        int[] capacity={4,3,1,5,2};
        System.out.println(minimumBoxes(apple,capacity));
    }

        public static int minimumBoxes(int[] apple, int[] capacity) {
            int sum=0;
            for(int i:apple)
                sum+=i;
            int result=0;
            int count=0;
            Arrays.sort(capacity);
            for(int i=capacity.length-1;i>=0;i--){
                result+=capacity[i];
                count++;
                if(result>=sum)
                    return count;
            }
            return 0;
        }
    }