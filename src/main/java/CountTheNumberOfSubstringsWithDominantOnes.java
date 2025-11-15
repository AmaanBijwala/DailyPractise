import java.util.*;
public class CountTheNumberOfSubstringsWithDominantOnes {
    public static void main(String[] args)
    {
        String s="00011";
        System.out.println(numberOfSubstrings(s));
    }

        public static int numberOfSubstrings(String s) {
            int n=s.length();
            int count=0;
            List<Integer> cumCount=new ArrayList<>();
            cumCount.add(s.charAt(0)=='1'?1:0);
            for(int i=1;i<n;i++){
                cumCount.add(cumCount.get(i-1)+(s.charAt(i)=='1'?1:0));
            }
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int countOfOne=cumCount.get(j)-(i-1>=0?cumCount.get(i-1):0);
                    int countOfZero=j-i+1-countOfOne;

                    if((countOfZero*countOfZero)>countOfOne){
                        int wasteIndices=(countOfZero*countOfZero)-countOfOne;
                        j+=wasteIndices-1;
                    }
                    else if((countOfZero*countOfZero)==countOfOne){
                        count+=1;
                    }
                    else{
                        count+=1;
                        int k=(int)Math.sqrt(countOfOne)-countOfZero;
                        int next=j+k;
                        if(next>=n){
                            count+=(n-j-1);
                            break;
                        }else{
                            count+=k;
                        }
                        j=next;
                    }

                }
            }
            return count;
        }
    }




