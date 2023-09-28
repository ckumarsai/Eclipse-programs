import java.util.*;
import java.io.*;
public class longestRepeatingWord{
    public static String longestprefix(String
    		s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, length);
    }
    public static void main(String args[])  {
        System.out.println("Enter The String:");
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String string2= "";
        int length=string1.length();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                String string3=longestprefix(string1.substring(i,length),string1.substring(j,length));
                 if(string3.length()>string2.length()){
                     string2=string3;
                 }
            }
             } System.out.println("Longest Sequence is:"+ string2);
            }
}

