import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueBinaryString {

        public String findDifferentBinaryString(String[] nums) {
            Set<String> s=new HashSet<>();
            for(String st:nums){
                s.add(st);
            }
            int len=nums[0].length();
            int range=(int)Math.pow(2,len);
            for(int i=range-1;i>=0;i--){
                String str=Integer.toBinaryString(i);
                if(!s.contains(str)){
                    int diff=len-str.length();
                    if(diff!=0){
                        StringBuilder sb=new StringBuilder();
                        for(int j=0;j<diff;j++){
                            sb.append("0");
                        }
                        return sb.append(str).toString();
                    }
                    return str;
                }
            }
            return "-1";
        }
    }
