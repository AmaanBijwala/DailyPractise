/*Reverse a string for specific position
Input :
str="HelloWorld"
start positionNum=4
end positionNum=8
Output :
HelroWolld

Hel  loWor ld
*/

public class ReverseStringAtIndex {
    public static void main(String[] args) {
        String str="HelloWorld";
        int len=str.length();
        int start_positionNum=4;
        int end_positionNum=8;
        StringBuilder sb=new StringBuilder();
        for(int i=end_positionNum-1;i>=start_positionNum-1;i--){
            sb.append(str.charAt(i));
        }
        String res=str.substring(0,start_positionNum-1)+sb.toString()+str.substring(end_positionNum,len);
        System.out.println("The reversed string is :"+res);
    }
}
