package Class_Codes.Day06;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        sub(str,"");
    }
    public static void sub(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        sub(str.substring(1),ans);
        sub(str.substring(1),ans+ch);

    }
}
