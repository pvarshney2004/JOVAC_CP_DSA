package LeetCode;

public class Container_11 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = ques(arr);
        System.out.println(ans);
    }
    public static int ques(int[] arr){
        int ans=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int min = Math.min(arr[i],arr[j]);
            int area = (j-i)*min;
            ans = Math.max(area,ans);
//            if(arr[i]<arr[j]){
//                i++;
//            }
//            else{
//                j--;
//            }
            while(i<j && arr[i]<=min){
                i++;
            }
            while(i<j && arr[j]<=min){
                j--;
            }
        }
        return ans;
    }

}
