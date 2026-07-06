
public class MirrorDistanceOfAnInteger {
    public int mirrorDistance(int n) {
        StringBuilder sb=new StringBuilder();
        sb.append(String.valueOf(n));
        int rev=Integer.parseInt(sb.reverse().toString());
        return Math.abs(rev-n);
    }
}