package Assignment03_R_B;

public class Remove_Duplicates_08_GFG {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String ans = remove(str);
        System.out.println(ans);
    }
    public static String remove(String str){
        String ans = "";
        char curr = str.charAt(0);
        for(int i=1;i<str.length(); i++){
            if(str.charAt(i)!=curr) {
                ans += curr;
                curr = str.charAt(i);
            }
        }
        return ans;
    }
}
