
import java.util.*;

public class RestoreFinishingOrder {
    public static void main(String[] args) throws Exception {
        int[] order={3,1,2,5,4};
        int[] friends={1,3,4};
        printArray(recoverOrder(order,friends));
    }
    public static  int[] recoverOrder(int[] order, int[] friends) {
        List<Integer>l=new LinkedList<>();
        for(int i :friends){
            l.add(i);
        }
        int myIndex=0;
        for(int i:order){
            if(l.contains(i)){
                friends[myIndex]=i;
                myIndex++;
            }
        }
        return friends;

    }

    public static void printArray(int [] res){
        System.out.print("[");
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }

}
