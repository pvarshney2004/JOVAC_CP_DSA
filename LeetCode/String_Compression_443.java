package LeetCode;
import java.util.*;
public class String_Compression_443 {
    public static void main(String[] args) {
        char[] arr = {'a','a','a','b','b','a','a'};
        String str = new String(arr);
        System.out.println(str);
        System.out.println(ques(str));
    }
    public static String ques(String str){
        StringBuilder sb  = new StringBuilder();
        int count=1;
        char curr = str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==curr){
                count++;
            }
            else{
                sb.append(curr);
                sb.append(count);
                curr = str.charAt(i);
                count = 1;
            }
        }
        sb.append(curr);
        sb.append(count);
        return sb.toString();

    }
}
