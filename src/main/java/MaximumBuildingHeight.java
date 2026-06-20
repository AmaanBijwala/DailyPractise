import java.util.HashMap;

/*
find pair that return the sum of target
[1,2,3,4,5,6,7,8,9,10]
target = 9
pair =[2,7]

 */
import java.util.*;
public class FindPairSumOfTheTarget {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        Map<Integer,Integer>indexMap=new HashMap<>();
        int []res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(indexMap.containsKey(nums[i])){
                res=new int[]{nums[i],target-nums[i]};
                break;
            }
            indexMap.put(target-nums[i],i);
        }
        System.out.println("[");
        for(int i:res){
            System.out.println(i+" ,");
        }
        System.out.println("]");
    }
}
