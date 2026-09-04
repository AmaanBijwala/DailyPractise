
import java.util.*;

public class CountCoveredBuildings {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","lenovo"),Arrays.asList("phone","gold","iphone"));
        int n=3;
        int[][] buildings={{1,1,},{1,2},{2,1},{2,2}};
        System.out.println(countCoveredBuildings(n,buildings));
    }

    public static int countCoveredBuildings(int n, int[][] buildings) {
        Arrays.sort(buildings,  (a,b)->a[1] == b[1] ? a[0]-b[0] : a[1]-b[1]);
        Set<String> xaligned = new HashSet<>();
        for( int i = 1; i < buildings.length-1; i++  ){
            if( buildings[i][1] == buildings[i-1][1] && buildings[i][1] == buildings[i+1][1]   ){
                xaligned.add(buildings[i][0]+","+buildings[i][1]);
            }
        }
        Arrays.sort(buildings,  (a,b)->a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
        int result = 0 ;
        for( int i = 1; i < buildings.length-1; i++  ){
            if( buildings[i][0] == buildings[i-1][0] && buildings[i][0] == buildings[i+1][0]   ){
                if( xaligned.contains(buildings[i][0]+","+buildings[i][1]) ) {
                    result++;
                }
            }
        }
        return result;
    }
}