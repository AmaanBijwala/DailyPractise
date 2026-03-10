

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public boolean hasAllCodes(String s, int k) {
        Set<String> seen=new HashSet<>();
        for(int i=0;i+k<=s.length();i++){
            seen.add(s.substring(i,i+k));
        }
        return seen.size()==(int)Math.pow(2,k);
    }
}