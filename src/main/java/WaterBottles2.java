
public class WaterBottles2 {
    public static void main(String[] args) {
        int numBottles=10;
        int x=3;
        System.out.println(maxBottlesDrunk(numBottles, x));
    }

    public static int maxBottlesDrunk(int numBottles, int x) {
        int ans = numBottles;
        while (numBottles >= x) {
            numBottles -= x - 1;
            x++;
            ans++;
        }
        return ans;
    }

}
