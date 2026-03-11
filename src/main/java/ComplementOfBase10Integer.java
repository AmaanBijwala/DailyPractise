

import java.util.Arrays;

public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(Character c:s.toCharArray()){
            sb.append(c=='0'?"1":"0");
        }
        return Integer.parseInt(sb.toString(),2);
    }
}