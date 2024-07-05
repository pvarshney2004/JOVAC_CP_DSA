package Class_Codes.Day09;
import java.util.*;

public class Palindrome_Partitioning_131{
    public static void main(String[] args) {
        String str = "aab";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        palindromePartition(str,ll,ans);
        System.out.println(ans);

    }
    public static void palindromePartition(String str,List<String> ll, List<List<String>> ans){
        if(str.isEmpty()){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1; i<=str.length(); i++){
            String s = str.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                palindromePartition(str.substring(i),ll,ans);
                ll.remove(ll.size()-1); //backtracking
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
