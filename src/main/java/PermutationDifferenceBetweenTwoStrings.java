
public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc","bac"));
    }
    public static int findPermutationDifference(String s, String t) {
        int count=0;
        int n=s.length();
        int i=0,sum=0;
        for(char c:s.toCharArray()){
            sum+=Math.abs(i-t.indexOf(c));
            i++;
        }
        return sum;
    }

}
