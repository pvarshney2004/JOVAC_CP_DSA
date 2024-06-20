package LeetCode;

import java.util.Arrays;

public class Magnetic_Force_1552 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1000000000};
        int m=2;
        Arrays.sort(arr);
        int ans = magnet(arr,m);
        System.out.println(ans);
    }
    public static int magnet(int[] arr, int m){
        int ans=0;
        int i=0;
        int j=arr[arr.length-1]-arr[0];
        while(i<=j){
            int mid = (i+j)/2;
            if(canPlace(arr,m,mid)){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    public static boolean canPlace(int[] arr, int m, int mid){
        int pos=arr[0];
        int c=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-pos>=mid){
                pos=arr[i];
                c++;
            }
            if(c==m){
                return true;
            }
        }
        return false;
    }
}
