package Class_Codes.Day07;

import java.util.*;

public class Lexico_Number {
    public static void main(String[] args) {
        int n=1000;
        List<Integer> ll = new ArrayList<>();
        lexico(n,0,ll);
        System.out.println(ll);

    }
    public static void lexico(int n, int curr, List<Integer> ll){
        if(curr>n){
            return;
        }
        ll.add(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9; i++){
            lexico(n,curr*10+i,ll);
        }
    }
}
