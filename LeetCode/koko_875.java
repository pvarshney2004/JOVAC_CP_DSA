package LeetCode;

import java.util.Arrays;

public class koko_875 {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h=5;
        Arrays.sort(arr);
        int ans = koko(arr,h);
        System.out.println(ans);
    }
    public static int koko(int[] arr, int h){
        // int ans=0;
        int lo=1;
        int hi=1000000000;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(canEat(arr,h,mid)){
                // ans=mid;
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return hi;
    }
    public static boolean canEat(int[] arr, int h, int mid){
        int hr=0;
        for(int x:arr){
            int div = x/mid;
            hr+=div;
            if(x%mid!=0){
                hr++;
            }
        }
        return hr<=h;
    }
}
