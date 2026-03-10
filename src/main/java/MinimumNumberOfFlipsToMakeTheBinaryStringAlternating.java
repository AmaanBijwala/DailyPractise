class MinimumNumberOfFlipsToMakeTheBinaryStringAlternating {

        public int minFlips(String s) {
            int n=s.length();
            s=s+s;
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i = 0; i < 2*n; i++){
                if(i % 2 == 0){ sb1.append('0'); sb2.append('1'); }
                else           { sb1.append('1'); sb2.append('0'); }
            }
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            int flip1=0;
            int flip2=0;
            int result=Integer.MAX_VALUE;
            int i=0;
            int j=0;
            while(j<2*n){
                if(s.charAt(j)!=s1.charAt(j)) flip1++;
                if(s.charAt(j)!=s2.charAt(j)) flip2++;
                if((j-i+1)>n){
                    if(s.charAt(i)!=s1.charAt(i)) flip1--;
                    if(s.charAt(i)!=s2.charAt(i)) flip2--;
                    i++;
                }
                if((j-i+1)==n){
                    result=Math.min(result,Math.min(flip1,flip2));
                }
                j++;
            }

            return result;
        }
    }