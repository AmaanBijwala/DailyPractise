
public class TakingMaximumEnergyFromTheMysticDungeon {
    public static void main(String[] args)
    {
        int[] energy={5,2,-10,-5,1};
        int k=3;
        System.out.println(maximumEnergy(energy,k));
    }
        public static int maximumEnergy(int[] energy, int k) {
            int n = energy.length;
            int ans = Integer.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                if (i + k < n)
                    energy[i] += energy[i + k];
                ans = Math.max(ans, energy[i]);
            }
            return ans;
        }
}