import java.util.Arrays;

public class String_Compression {
    public static void main(String[] args) {
        String str = "aabccc";
        int[] arr = new int[26];
        ques(str,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ques(String str, int[]arr){
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }
        String ans="";
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                char ch = (char)(i+97);
                if(arr[i]==1){
                    ans+=ch;
                }
                else{
                    ans+=ch;
                    ans+=arr[i];
                }
            }
        }
        System.out.println(ans);
    }
}
