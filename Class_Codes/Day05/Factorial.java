package Class_Codes.Day05;

public class Factorial {
    public static void main(String[] args) {
        int n=-5;
        int ans = fact(n);
        System.out.println(ans);
    }
    public static int fact(int n){
        if(n<0){
            return 0;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
