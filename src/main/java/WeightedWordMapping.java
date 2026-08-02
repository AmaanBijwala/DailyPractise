
public class WeightedWordMapping {

    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        String a="abcdefghijklmnopqrstuvwxyz";
        String rev=new StringBuilder(a).reverse().toString();
        for(String word: words){
            int sum=0;
            for(Character c:word.toCharArray()){
                int idx=c-97;
                sum+=weights[idx];
            }
            int n=sum%26;
            res+=String.valueOf(rev.charAt(n));
        }
        return res;
    }
}