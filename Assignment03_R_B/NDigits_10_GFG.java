package Assignment03_R_B;

import java.util.ArrayList;
import java.util.Arrays;

public class NDigits_10_GFG {
    public static void main(String[] args) {
        int n=1;
        int i=0;
        ArrayList<Integer> ll = new ArrayList<>();
        while(len(i)<=n){
            if(inc(i) && len(i)==n){
                ll.add(i);
            }
            i++;
        }
        System.out.println(ll);
    }
    public static int len(int n){
        if(n<=9 && n>=0){
            return 1;
        }
        int len=0;
        while(n!=0){
            len++;
            n/=10;
        }
        return len;
    }
    public static boolean inc(int n){
        if(n<=9){
            return true;
        }
        int x=len(n);
        int[]arr = new int[x];
        int i=1;
        while (n > 0) {
            int rem = n%10;
            arr[x-i]=rem;
            n/=10;
            i++;
        }
//        System.out.println(Arrays.toString(arr));
        if(isSorted(arr)){
            return true;
        }
        return false;
    }
    public static boolean isSorted(int[]arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
