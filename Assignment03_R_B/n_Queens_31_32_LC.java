package Assignment03_R_B;
import java.util.*;

public class n_Queens_31_32_LC {
    //51,52
    public static void main(String[] args) {
        int n=4;
        char[][] arr = new char[n][n];;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(n,arr,0,ans);
        System.out.println(ans);

    }
    public static void solve(int n, char[][]arr, int row, List<List<String>> ans){
        if(n==0){
            ans.add(set(arr));
            return;
        }
        for(int col=0; col<arr[0].length; col++){
            if(isSafe(arr,row,col)){
                arr[row][col]='Q';
                solve(n-1,arr,row+1,ans);
                arr[row][col]='.';
            }
        }
    }
    public static boolean isSafe(char[][]arr, int row, int col){
        //up
        int r=row;
        while(r>=0){
            if(arr[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //left diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r=row;
        c=col;
        while(r>=0 && c<arr[0].length){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    //converting the char array into list
    public static List<String> set(char[][] arr){
        List<String> ll = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            ll.add(new String(arr[i]));
        }
        return ll;
    }
}
