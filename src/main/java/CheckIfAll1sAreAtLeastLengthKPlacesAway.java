class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public static void main(String[] args) {
        int[]nums={0,1,0,0,0,1,0,0,1};
        int k=2;
        System.out.println(kLengthApart(nums,k));
    }


        public static  boolean kLengthApart(int[] nums, int k) {
            int place=k+1;
            for(int i:nums){
                if(i==1){
                    if(place<k)
                        return false;
                    place=0;
                }else{
                    place++;
                }
            }
            return true;
        }


}
