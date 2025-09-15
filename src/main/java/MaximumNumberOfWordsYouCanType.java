
public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args)
    {
        String text = "hello world", brokenLetters = "ad";
        System.out.println(canBeTypedWords(text,brokenLetters));
    }



    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] strArr=text.split(" ");
        int count=0;
        for(String s:strArr){
            boolean isWritable=true;
            for(char b : brokenLetters.toCharArray()){
                if(s.indexOf(b)!=-1){
                    isWritable=false;
                    break;
                }
            }
            if(isWritable)
                count++;
        }
        return count;
    }



}

