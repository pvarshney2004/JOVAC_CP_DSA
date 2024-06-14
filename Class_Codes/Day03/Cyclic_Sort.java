package Class_Codes.Day03;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {4,1,2,5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr){
        for(int i=0; i<arr.length; i++){
            while(i+1!=arr[i]){
                int idx=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
    }

}
