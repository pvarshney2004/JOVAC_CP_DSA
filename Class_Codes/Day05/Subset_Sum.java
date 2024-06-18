package Class_Codes.Day05;

public class Subset_Sum {
    public static void main(String[] args) {
        int[] arr= {1,1,2,1,3};
        int target = 4;
        int count = sub(arr,0,target);
        System.out.println(count);
    }
    public static int sub(int[] arr, int idx,int target){
        if(target==0){
            return 1;
        }
        int a=0;
        for(int i=idx; i<arr.length; i++){
            if(arr[i]<=target){
                a+=sub(arr,i+1,target-arr[i]);
            }
        }
        return a;
    }
}
