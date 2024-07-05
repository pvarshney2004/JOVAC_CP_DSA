package Class_Codes.Day10;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[]arr = {10,5,4,3,8,9,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[]arr, int i, int j){
        if(i>=j){
            return;
        }
        int pos = setLast(arr,i,j);
        quickSort(arr,0,pos-1);
        quickSort(arr,pos+1,j);
    }
    public static int setLast(int[]arr, int si, int ei){
        int pos=si;
        int item=arr[ei];
        for(int i=pos; i<ei; i++){
            if(arr[i]<item){
                swap(arr,i,pos);
                pos++;
            }
        }
        swap(arr,pos,ei);
        return pos;
    }
    public static void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
