public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int nums=14;
        System.out.println(numberOfSteps(nums));
    }
        public static int numberOfSteps(int num) {
            boolean isEven=false;
            int c=0;
            while(num!=0){
                isEven=num%2==0?true:false;
                if(isEven){
                    num/=2;
                }else{
                    num-=1;
                }
                c++;
            }
            return c;
        }

}
