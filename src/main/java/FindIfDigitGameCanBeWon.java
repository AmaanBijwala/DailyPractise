
public class FindIfDigitGameCanBeWon {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,10};
        System.out.println(canAliceWin(nums));
    }


        public static boolean canAliceWin(int[] nums) {
            int a=0;
            int b=0;
            for(int i: nums){
                if(i/10>0)
                    a+=i;
                else
                    b+=i;
            }
            return a==b?false:true;
        }


}
