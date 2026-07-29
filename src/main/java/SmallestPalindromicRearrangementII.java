import java.util.*;
public class SecondMAXAndSecondMIN {
    public static void main(String[] args) {
        List<Integer> listOfIntegers=Arrays.asList(45, 12, 56, 15, 24, 33,11,111, 75, 31, 89);
        int min=Integer.MAX_VALUE;
        int sMin=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i:listOfIntegers){
            if(i>max){
                sMax=max;
                max=i;
            }else if(i>sMax && max!=sMax){
                sMax=i;
            }

            if(i<min){
                sMin=min;
                min=i;
            }else if(i<sMin && sMin!=min){
                sMin=i;
            }
        }
        System.out.println("Second Latrgest Element is "+sMax+" Second Smallest value is "+sMin);
    }
}
