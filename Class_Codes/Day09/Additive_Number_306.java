package Class_Codes.Day09;
import java.util.*;

public class Additive_Number_306 {
    public static void main(String[] args) {
        String str = "112358";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partition(str, ll,ans);
        System.out.println(ans);
    }
    public static void partition(String str, List<String> ll,List<List<String>> ans){
        if(str.isEmpty()){

            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1; i<=str.length(); i++){
            String s = str.substring(0,i);
                ll.add(s);
                partition(str.substring(i),ll,ans);
                ll.remove(ll.size()-1);
        }
    }
//    public static boolean isValid(List<String> ll){
//        if(ll.size()<2){
//            return false;
//        }
//        return true;
//    }
}
