package Class_Codes.Day08;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int n=4;
        int[][]arr = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        ArrayList<String> ll = new ArrayList<>();
        rat(arr,0,0,"",ll);
        System.out.println(ll);

    }
    public static void rat(int[][] arr, int cr, int cc, String ans,ArrayList<String> ll){
        if(cr<0 || cc<0 || cc>arr[0].length-1 || cr>arr.length-1 ||arr[cr][cc]==0){
            return;
        }
        if(cr==arr.length-1 && cc==arr[0].length-1){
            ll.add(ans);
            return;
        }
        int val=arr[cr][cc];
        arr[cr][cc]=0;
        rat(arr,cr-1,cc,ans+"U",ll);
        rat(arr,cr+1,cc,ans+"D",ll);
        rat(arr,cr,cc-1,ans+"L",ll);
        rat(arr,cr,cc+1,ans+"R",ll);
        arr[cr][cc]=val;

    }
}
