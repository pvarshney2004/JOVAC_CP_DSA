package Class_Codes.Day05;

public class SUB_String {
    public static void main(String[] args) {
        String str = "abc";
        sub(str,"");
    }
    public static void sub(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+"\t");
            return;
        }
        char ch = str.charAt(0);
        sub(str.substring(1),ans);
        sub(str.substring(1),ans+ch);
    }
}
