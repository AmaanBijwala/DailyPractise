public class WaterBottles {
    public static void main(String[] args) {
        int numBottles=9;
        int numExchange=2;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }

        public static int numWaterBottles(int numBottles, int numExchange) {
            int sum=numBottles;
            int newBottles=0;
            while(numBottles>=numExchange){                     //9 3
                newBottles=numBottles%numExchange;              //0 0
                sum+=numBottles/numExchange;                    //9+3+3
                numBottles=(numBottles/numExchange)+newBottles; //3 1
            }
            return sum;
        }

}
