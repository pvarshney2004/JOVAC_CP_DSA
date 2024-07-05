package LeetCode;

import java.util.Arrays;

public class Sort_Colors_75 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //when we have to sort the array in which on the basis of three types of vale then it is known as DNF algo.
    public static void sort(int[] arr){
        int i=0;
        int j=arr.length-1;
        int idx=0;
        while(idx<=j){
            if(arr[idx]==0){
                swap(arr,idx,i);
                i++;
                idx++;
            }
            else if(arr[idx]==1){
                idx++;
            }
            else{
                swap(arr,idx,j);
                j--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
