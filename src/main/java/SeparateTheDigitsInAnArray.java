

public class SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int n:nums){
            sb.append(String.valueOf(n));
        }
        int n=sb.length();
        int a[]=new int[n];
        int j=0;
        String st=sb.toString();
        for(int i=0;i<n;i++){
            a[j++]=Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        return a;
    }
}
    