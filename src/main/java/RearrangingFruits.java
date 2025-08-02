import java.util.*;

public class RearrangingFruits {
    public static void main(String[] args) {
        int[] basket1={4,2,2,2};
        int[] basket2={1,4,1,2};
        System.out.println(minCost(basket1,basket2));
    }

        public static  long minCost(int[] basket1, int[] basket2) {
            Map<Integer,Integer> m=new HashMap<>();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<basket1.length;i++){
                m.put(basket1[i],m.getOrDefault(basket1[i],0)+1);
                min=Math.min(min,basket1[i]);
            }
            for(int i=0;i<basket2.length;i++){
                m.put(basket2[i],m.getOrDefault(basket2[i],0)-1);
                min=Math.min(min,basket2[i]);
            }
            List<Integer>l1=new ArrayList<>();
            List<Integer>l2=new ArrayList<>();
            for(Map.Entry<Integer,Integer>var:m.entrySet()){
                int n=var.getValue();
                if(n==0){
                    continue;
                }
                if(n%2!=0){
                    return -1;
                }
                if(n>0){
                    for(int i=0;i<Math.abs(n)/2;i++){
                        l1.add(var.getKey());
                    }
                }
                if(n<0){
                    for(int i=0;i<Math.abs(n)/2;i++){
                        l2.add(var.getKey());
                    }
                }
            }
            if(l1.size()==0)
                return 0;
            l1.sort(null);
            l2.sort(Collections.reverseOrder());
            long sum=0;


            for(int i=0;i<l1.size();i++){
                sum+=Math.min(Math.min(l1.get(i),l2.get(i)),min*2);
            }
            return sum;
        }

}
/*
2561. Rearranging Fruits

You have two fruit baskets containing n fruits each. You are given two 0-indexed integer arrays basket1 and basket2 representing the cost of fruit in each basket. You want to make both baskets equal. To do so, you can use the following operation as many times as you want:
Chose two indices i and j, and swap the ith fruit of basket1 with the jth fruit of basket2.
The cost of the swap is min(basket1[i],basket2[j]).
Two baskets are considered equal if sorting them according to the fruit cost makes them exactly the same baskets.
Return the minimum cost to make both the baskets equal or -1 if impossible.

Example 1:
Input: basket1 = [4,2,2,2], basket2 = [1,4,1,2]
Output: 1
Explanation: Swap index 1 of basket1 with index 0 of basket2, which has cost 1. Now basket1 = [4,1,2,2] and basket2 = [2,4,1,2]. Rearranging both the arrays makes them equal.

Example 2:
Input: basket1 = [2,3,4,1], basket2 = [3,2,5,1]
Output: -1
Explanation: It can be shown that it is impossible to make both the baskets equal.


Constraints:
basket1.length == basket2.length
1 <= basket1.length <= 105
1 <= basket1[i],basket2[i] <= 109
 */