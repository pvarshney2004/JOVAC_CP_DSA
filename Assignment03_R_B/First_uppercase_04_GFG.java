package Assignment03_R_B;

public class First_uppercase_04_GFG {
    public static void main(String[] args) {
        String str = "geeksForgeeks";
        char ch = find(str,0);
        if(ch=='0'){
            System.out.println("No Uppercase Letter in String");
        }
        else{
            System.out.println(ch);
        }
    }
    public static char find(String str, int idx){
        if(idx==str.length()){
            return '0';
        }
        if(Character.isUpperCase(str.charAt(idx))){
            return str.charAt(idx);
        }
        return find(str,idx+1);
    }
}
