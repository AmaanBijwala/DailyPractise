import java.util.*;

public class SortIntegersByTheNumberOf1Bits {

        public int[] sortByBits(int[] arr) {
            //Arrays.sort(arr);
            Map<Integer, List<Integer>> m=new HashMap<>();
            for(int i:arr){
                int k=Integer.bitCount(i);
                if(m.containsKey(k)){
                    m.get(k).add(i);
                }else{
                    List<Integer>l=new ArrayList<>();
                    l.add(i);
                    m.put(k,l);
                }
            }
            int size=m.size();
            int [] a=new int[size];
            int j=0;
            for(int key:m.keySet()){
                a[j++]=key;
            }
            Arrays.sort(a);
            int k=0;
            for(int el:a){
                List<Integer> nos=m.get(el);
                Collections.sort(nos);
                System.out.println("key is "+el);
                for(int i:nos){
                    System.out.println("---->val is "+i+"\n");
                    arr[k++]=i;
                }
            }
            return arr;
        }
    }