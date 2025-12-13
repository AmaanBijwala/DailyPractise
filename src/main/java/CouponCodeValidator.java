
import java.util.*;

public class CouponCodeValidator {
    public static void main(String[] args) {
        String[] code={"SAVE20","","PHARMA5","SAVE@20"};
        String[] businessLine={"restaurant","grocery","pharmacy","restaurant"};
        boolean[] isActive={true,true,true,true};
        printArray(validateCoupons(code,businessLine,isActive));
    }


    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        int n=code.length;
        Set<String>s=Set.of("electronics", "grocery", "pharmacy", "restaurant");
        List<String[]> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!isActive[i] || code[i]==null ||
                    code[i].equals("") || !code[i].matches("[a-zA-Z0-9_]+")
                    || !(s.contains(businessLine[i].toLowerCase())))
                continue;
            System.out.println("gg"+code[i]);
            l.add(new String[]{code[i],businessLine[i]});
        }
        Collections.sort(l,(a,b)->{
            if(a[1].compareTo(b[1])!=0)
                return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
        List<String> ans=new ArrayList<>();
        for(String[] str:l){
            ans.add(str[0]);
        }
        return ans;
    }

    public static void printArray(List<String> result){
        for(String i: result){
            System.out.print(i+" ");
        }
    }
}