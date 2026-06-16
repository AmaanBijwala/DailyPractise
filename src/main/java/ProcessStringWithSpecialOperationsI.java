

public class ProcessStringWithSpecialOperationsI {

    public String processStr(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            System.out.println("c-->"+c+"  r-->"+r);
            if(c=='*'){
                if(r.length()>0){
                    r=r.substring(0,r.length()-1);
                }
            }
            else if(c=='#')
                r=r+r;
            else if(c=='%'){
                StringBuilder sb=new StringBuilder(r);
                r=sb.reverse().toString();
            }
            else
                r+=c;

        }
        return r;
    }
}