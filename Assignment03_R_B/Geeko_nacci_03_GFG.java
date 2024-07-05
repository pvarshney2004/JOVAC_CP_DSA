package Assignment03_R_B;

import java.util.Scanner;

public class Geeko_nacci_03_GFG {
    public static void main(String[] args) {
//        int a=1,b=3,c=2;
//        int n=6;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int ans = find(n);
            System.out.println(ans);
        }

    }
    public static int find(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 3;
        }
        if(n==3){
            return 2;
        }
        int x = find(n-1);
        int y = find(n-2);
        int z = find(n-3);
        return x+y+z;
    }
}
