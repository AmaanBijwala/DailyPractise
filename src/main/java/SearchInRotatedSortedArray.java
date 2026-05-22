public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int n=nums.length;
        if(nums[n-1]==target)
            return n-1;
        if(nums[0]==target)
            return 0;
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target)
                return idx;
            System.out.println("idx "+idx);
            idx++;
        }
        return -1;
    }
}