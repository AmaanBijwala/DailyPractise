public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

        public static int lengthOfLastWord(String s) {
            s=s.trim();
            int n=s.length();
            if(!s.contains(" "))
                return n;
            int count=0;
            for(int i=n-1;i>0;i--){
                if(s.charAt(i)==' '){
                    break;
                }else{
                    count++;
                }
            }
            return count;
        }

}
