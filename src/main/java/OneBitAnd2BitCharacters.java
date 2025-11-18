
public class OneBitAnd2BitCharacters {
    public static void main(String[] args)
    {
        int[] bits={1,0,0};
        System.out.println(isOneBitCharacter(bits));
    }


    public static boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int count=0;
        for(int i=n-2;i>=0 && bits[i]==1;i--){
            count++;
        }
        return count%2==0?true:false;
    }



}
