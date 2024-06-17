package LeetCode;

public class Rotate_Image_48 {
    public static void main(String[] args) {
        //input and output
    }
    public static void rotate(int[][] arr) {
        transpose(arr);
        for(int i=0; i<arr.length; i++){
            int a=0;
            int b=arr[0].length-1;
            while(a<=b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
    }
    public static void transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
