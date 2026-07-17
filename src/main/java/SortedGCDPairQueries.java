

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(char c:moves.toCharArray()){
            if(c=='L')
                l++;
            if(c=='R')
                r++;
            if(c=='U')
                u++;
            if(c=='D')
                d++;
        }
        return (l==r && u==d)?true:false;
    }
}