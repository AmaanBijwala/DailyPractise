/*
8)WAP to print ASCII of strinhgh
String str="Amaan";
 */
import java.util.*;
public class PrintASCIIValueOfString {
    public static void main(String[] args) {
        String str = "Amaan";
        printASCII(str);
    }
    static void printASCII(String str){
        str.chars()
                //.mapToObj(c->(char)c)
                .forEach(ch-> System.out.println("Character "+(char)ch+" ASCII Value is "+ch));
    }
}
