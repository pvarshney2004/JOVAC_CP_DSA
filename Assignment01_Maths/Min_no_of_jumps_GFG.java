package Assignment01_Maths;

public class Min_no_of_jumps_GFG {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        int n=6;
        int ans = jumps(arr,n);
        System.out.println(ans);

    }
    public static int jumps(int[] arr, int n){
        if(arr[0]==0){
            return -1;
        }
        int c=0;
        int x=0; //recent track
        while(x<arr.length-1){
            x+=arr[x];
            c++;
        }
        //2 2 0 3
        return c;


    }
}
