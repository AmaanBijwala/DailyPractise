
import java.util.*;
class SortThePeople {
    public static void main(String[] args) {
        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};
        printArray(sortPeople(names,heights));
    }

        public static String[] sortPeople(String[] names, int[] heights) {
            int n= heights.length;
            Map<Integer,String>m=new HashMap<>();
            for(int i=0;i<n;i++){
                m.put(heights[i],names[i]);
            }
            Arrays.sort(heights);
            for(int i=n-1;i>=0;i--){
                names[n-i-1]=m.get(heights[i]);
            }
            return names;
        }


    public static void printArray(String[] result){
        for(String i: result){
            System.out.print(i+",");
        }
    }
}
