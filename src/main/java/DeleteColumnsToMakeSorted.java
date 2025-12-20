import java.util.LinkedList;
import java.util.List;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] strs={"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }

        public static int minDeletionSize(String[] strs) {
            int n=strs.length;
            int len=strs[0].length();
            int count=0;
            for(int j=0;j<len;j++){
                for(int i=1;i<n;i++){
                    // System.out.println(strs[j].charAt(i)+""+strs[j].charAt(i-1));
                    if(strs[i].charAt(j)<strs[i-1].charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            return count;
        }
    }