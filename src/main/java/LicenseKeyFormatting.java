
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String  s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(licenseKeyFormatting(s,k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        int count=0;
        s=s.replace("-","");
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=Character.toUpperCase(s.charAt(i));
            sb.append(c);
            count++;
            if(count==k && i!=0){
                count=0;
                sb.append("-");
            }
        }
        return sb.reverse().toString();
    }

}
