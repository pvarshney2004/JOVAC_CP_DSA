package Assessment03;

import java.util.*;

public class N_Queen {
    public static void main(String[] args) {
        int n=2;
        char[][] arr = new char[n][n];;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nQueen(n-1,arr,0,ans);
        System.out.println(ans);
//        int ans1 = find(n,ans);
//        System.out.println(ans1);


    }
//    public static int find(int n,char[][]arr,List<List<String>> ans){
//        if(n==2){
//            return 4;
//        }
//        nQueen(n-1,arr,0,ans);
//
//    }

    public static void nQueen(int n, char[][]arr, int row, List<List<String>> ans){
        if((n-1)==0){
            ans.add(set(arr));
            return;
        }
        for(int i=row; i<arr.length; i++){
            for(int col=0; col<arr[0].length; col++){
                if(isSafe(arr,row,col)){
                    arr[row][col]='Q';
                    nQueen(n-1,arr,row+1,ans);
                    arr[row][col]='.';
                }
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        //up
        int r=row;
        while(r>=0){
            if(board[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //left
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        //right
        r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]=='Q'){
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
