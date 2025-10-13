

public class DetectCapital {
    public static void main(String[] args)
    {
        String word = "Flag";
        System.out.println(detectCapitalUse(word));
    }





    public static boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1)
            return true;
        if(Character.isUpperCase(word.charAt(1))){
            if(upperCaseCheck(word))
                return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            if(checkMixedCase(word))
                return true;
        }
        if(checkLowerCase(word)){
            return true;
        }
        return false;
    }
    public static boolean checkLowerCase(String word){
        for(Character c:word.toCharArray()){
            if(!Character.isLowerCase(c))
                return false;
        }
        return true;
    }

    public static boolean upperCaseCheck(String word){
        for(Character c:word.toCharArray()){
            if(!Character.isUpperCase(c))
                return false;
        }
        return true;
    }
    public static boolean checkMixedCase(String word){
        for(int i=1;i<word.length();i++){
            if(!Character.isLowerCase(word.charAt(i)))
                return false;
        }
        return true;
    }


}


