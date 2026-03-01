

import java.util.Arrays;
import java.util.List;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        int max=1;
        for(int i=0;i<n.length();i++){
            int no=n.charAt(i)-'0';
            max=Math.max(max,no);
        }
        return max;
    }
}