
import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int m=nums1.length, n=nums2.length;
        if(nums1[m-1]<nums2[0] && nums2[n-1]<nums1[0])
            return -1;
        while(i<m && j<n){
            if(nums1[i] == nums2[j])
                return nums1[i];
            else if(nums1[i] > nums2[j])
                j++;
            else
                i++;
        }
        return -1;
    }
}