
import java.util.*;
public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

        public static int numUniqueEmails(String[] emails) {
            Set<String>set=new HashSet<>();
            for(String s:emails){
                int n=s.length();
                int index=s.indexOf('@');
                String localName=s.substring(0,index);;
                String domainName=s.substring(index+1,n);
                if(localName.indexOf('+')!=-1){
                    localName=localName.substring(0,localName.indexOf('+'));
                }
                localName=localName.replace(".","");
                set.add(localName+"@"+domainName);
            }
            return set.size();
        }

}
