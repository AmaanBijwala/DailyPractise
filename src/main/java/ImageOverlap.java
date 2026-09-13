

import java.util.*;

public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>outerList=new ArrayList<>();
        List<Integer>innerList=new ArrayList<>();
        int minDiff=Math.abs(arr[0]-arr[1]);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            minDiff=Math.min(minDiff,Math.abs(arr[i]-arr[i+1]));
        }
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==minDiff){
                innerList.add(arr[i]);
                innerList.add(arr[i+1]);
                outerList.add(innerList);
                innerList=new ArrayList<>();
            }
        }
        return outerList;
    }
}