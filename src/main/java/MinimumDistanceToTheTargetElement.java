
class MinimumDistanceToTheTargetElement {

    public int getMinDistance(int[] nums, int target, int start) {
        if(target==nums[start]) return 0;
        int n=nums.length, dist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            if(target==nums[i])	dist=Math.min(dist,Math.abs(start-i));
        return dist;
    }
}