package Assignment02_Arrays_4Q;
import java.util.*;
public class Check_Array_Sorted_Rotated_1752 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        int x=1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]) {
                x++;
            }
            else{
                break;
            }
        }
        int[] brr = new int[arr.length];
        for(int i=0; i<brr.length; i++){
            brr[i]=arr[i];
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
//        System.out.println(Arrays.toString(brr)); //[3, 4, 5, 1, 2]
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==brr[(i+x)%arr.length]){
                c++;
            }
        }
        if(c==arr.length){
            return true;
        }
        else{
            return false;
        }
    }
}
