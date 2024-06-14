package Assignment02_Arrays_4Q;

public class Third_Max_Num {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }
    public static int thirdMax(int[] arr) {
        long max = Long.MIN_VALUE;
        long secmax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(max>arr[i] && arr[i]>secmax){
                secmax=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(max>arr[i] && secmax>arr[i] && arr[i]>tmax){
                tmax=arr[i];
            }
        }
        if(tmax!=Long.MIN_VALUE){
            return (int)tmax;
        }
        else{
            return (int)max;
        }

    }
}
