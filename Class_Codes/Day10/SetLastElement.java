package Class_Codes.Day10;

import java.util.Arrays;

public class SetLastElement {
    public static void main(String[] args) {
        int[] arr = {10,5,4,3,8,9,6};
        int item=arr[arr.length-1];
        int pos=0;
        int i=0;
        while(i<arr.length-1){
            if(arr[i]<item){
                swap(arr,i,pos);
                pos++;
            }
            i++;
        }
//        for(; i<arr.length-1; i++){
//            if(arr[i]<item){
//                swap(arr,i,pos);
//                pos++;
//            }
//        }
        swap(arr,pos,i);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
