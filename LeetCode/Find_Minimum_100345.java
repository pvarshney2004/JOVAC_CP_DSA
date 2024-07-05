package LeetCode;
//3190 Leetcode - You are given an integer array nums.
// In one operation, you can add or subtract 1 from any element of nums.
//Return the minimum number of operations to make all elements of nums divisible by 3.
public class Find_Minimum_100345 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = ques(arr);
        System.out.println(ans);
    }
    public static int ques(int[] arr){
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3!=0){
                if((arr[i]-1)%3==0){
                    c++;
                }
                else if((arr[i]+1)%3==0){
                    c++;
                }
            }
        }
        return c;
    }
}
