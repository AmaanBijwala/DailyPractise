
public class BinaryGap {


        public int binaryGap(int n) {
            int ans=0;
            int count=0;
            String s=Integer.toBinaryString(n);
            int index=s.indexOf("1");
            boolean twiceCnt=false;
            if(index==-1)
                return 0;
            for(int i=index+1;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    ans=Math.max(ans,count);
                    count=0;
                    twiceCnt=true;
                }
                else
                    count++;
            }
            return twiceCnt?ans+1:0;
        }
    }