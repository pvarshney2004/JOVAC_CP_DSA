package Assignment02_Arrays_4Q;
import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        int n=5;
        int d=2;
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotateLeft(arr,d,n);
        System.out.println(Arrays.toString(arr));


    }
    public static void rotateLeft(int[]arr, int d, int n){
        int k=n-d;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }
    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
