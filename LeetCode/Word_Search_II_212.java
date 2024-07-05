package LeetCode;

import java.util.*;

public class Word_Search_II_212 {
    public static void main(String[] args) {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] arr = {"oath","oathk","eat","rain"};
        int idx=0;
        List<String> ans = new ArrayList<>();
        while(idx<arr.length){
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[0].length; j++){
                    String s = arr[idx];
                    if(board[i][j]==s.charAt(0)) {
                        boolean check = search(board,s,new boolean[board.length][board[0].length], i,j,0);
                        if (check) {
                            ans.add(s);
                        }
                    }
                }
            }
            idx++;
        }
        for(int i=0; i<board.length; i++){
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println(ans);
    }
    public static boolean search(char[][]board, String s,boolean[][] brr,int cr, int cc, int idx){
        if(idx==s.length()){
            return true;
        }
        if( cc<0 || cr<0 || cc>=board[0].length || cr>=board.length || s.charAt(idx) != board[cr][cc] || brr[cr][cc]){
            return false;
        }
//        char temp = board[cr][cc];
//        board[cr][cc]='*';
        brr[cr][cc]=true;
        int[] r = { -1, 0, 1, 0 };
        int[] c = { 0, -1, 0, 1 };
        for(int i=0; i<r.length; i++){
            boolean ans = search(board,s,brr,cr+r[i],cc+c[i],idx+1);
            if(ans){
                return true;
            }
        }
        brr[cr][cc]=false;
//        board[cr][cc]=temp;
//        search(board,s,cr,cc+1,idx+1);
//        search(board,s,cr+1,cc,idx+1);
        return  false;
    }
}
