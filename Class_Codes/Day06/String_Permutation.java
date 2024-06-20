package Class_Codes.Day06;

public class String_Permutation {
    static int count=0;
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,"");
        System.out.println(count);
    }
    public static void permutation(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            count++;
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            permutation(str.substring(0,i)+str.substring(i+1),ans+ch);
        }
    }
}
