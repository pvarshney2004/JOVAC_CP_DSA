package Assignment03_R_B;

import java.util.*;

public class Additive_Number_35_LC {
    //306 LC
    public static void main(String[] args) {
        String str = "112358";
        boolean ans = partition(str, new ArrayList<>());
        System.out.println(ans);
    }
    public static boolean partition(String str, ArrayList<Long> list){
        if(str.isEmpty()){
            System.out.println(list);
            return list.size()>=3;
        }
        for(int i=1; i<=str.length(); i++){
            String sub = str.substring(0,i);
            String remain = str.substring(i);
            if(startsWithZero(sub) && isValidPartition(list,sub)){
                long curr = Long.parseLong(sub);
                list.add(curr);
                boolean isValid = partition(remain , list);
                if(isValid){
                    return true;
                }
                list.remove(list.size()-1);
            }
        }
        return false;
    }
    public static  boolean startsWithZero(String curr){
        if(curr.length() == 1){
            return true;
        }
        return curr.charAt(0) != '0';
    }
    public static boolean isValidPartition(ArrayList<Long> list, String curr) {
        if (list.size() < 2) {
            return true;
        }
        Long last = list.get(list.size() - 1);
        Long second_last = list.get(list.size() - 2);
        Integer c = new Integer(curr);
         return c == last + second_last;
//        return c.equals(last.add(second_last));
    }
}
