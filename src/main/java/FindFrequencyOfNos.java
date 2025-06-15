import java.util.*;
public class FindFrequencyOfNos {
    public static void main(String[] args) {
        int[] a={1,2,8,3,4,5,6,6,8};
        System.out.println("Frequency of max character is "+findFreqOfNos(a));
    }
    static int findFreqOfNos(int[] a){
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:a){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int maxKey=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>v:m.entrySet()){
            if(v.getValue()>max) {
                max = v.getValue();
                maxKey=v.getKey();
            }
            else if(v.getValue()==max) {
                maxKey =Math.min(v.getKey(),maxKey);
            }
        }
        return maxKey;
    }
}
