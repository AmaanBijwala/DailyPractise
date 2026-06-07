import java.util.*;
public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args)
    {
        int nums[]={5,3,6,1,12};
        int original=3;
        System.out.println(findFinalValue(nums, original));
    }

        public static  int findFinalValue(int[] nums, int original) {
            Set<Integer>s=new HashSet<>();
            for(int i:nums){
                s.add(i);
            }
            while(s.contains(original)){
                original*=2;
            }
            return original;
        }
    }

