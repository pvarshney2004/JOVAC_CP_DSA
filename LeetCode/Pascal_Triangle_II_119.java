package LeetCode;
import java.util.*;
public class Pascal_Triangle_II_119 {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> ll = new ArrayList<>();
        long val=1;
        for(int r=0; r<=n; r++){
            ll.add((int)val);
            val=((n-r)*val)/(r+1);
        }
        System.out.println(ll);
    }
}
