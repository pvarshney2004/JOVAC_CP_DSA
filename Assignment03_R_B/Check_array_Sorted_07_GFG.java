package Assignment03_R_B;

public class Check_array_Sorted_07_GFG {
    public static void main(String[] args) {
        int[] arr = {90, 80, 100, 70, 40, 30};
        System.out.println(isSort(arr));
//        System.out.println(check(arr,1));
    }
//    public static boolean check(int[] arr, int idx){
//        if(idx==arr.length){
//            return true;
//        }
//        if(arr[idx]<arr[idx-1]){
//            return false;
//        }
//        return check(arr,idx+1);
//    }
    public static boolean isSort(int[]arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
