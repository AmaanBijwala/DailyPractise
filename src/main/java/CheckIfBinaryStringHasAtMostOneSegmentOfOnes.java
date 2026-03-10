import java.util.Arrays;
import java.util.List;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

        public boolean checkOnesSegment(String s) {
            int n=s.length();
            boolean lowFlag=false;
            if(n<3)
                return true;
            for(int i=1;i<n;i++){
                if(s.charAt(i)=='0')
                    lowFlag=true;
                if(lowFlag && s.charAt(i)=='1')
                    return false;
            }
            return true;
        }
    }

