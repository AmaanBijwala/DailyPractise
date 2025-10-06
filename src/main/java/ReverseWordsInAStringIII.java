
public class ReverseWordsInAStringIII {
    public static void main(String[] args)
    {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }


        public static String reverseWords(String s) {
            StringBuilder sb=new StringBuilder();
            String[] strArray=s.split(" ");
            for(String str:strArray){
                sb.append(reverseWord(str)).append(" ");
            }
            return sb.toString().trim();
        }
        public static String reverseWord(String str){
            StringBuilder sb=new StringBuilder();
            for(int i=str.length()-1;i>=0;i--){
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }


}
