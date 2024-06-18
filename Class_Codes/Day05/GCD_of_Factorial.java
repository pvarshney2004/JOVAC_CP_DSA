package Class_Codes.Day05;

public class GCD_of_Factorial {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        ques(a,b);
    }
    public static void ques(int a, int b){
        a=Math.min(a,b);
        int ans = fact(a);
        System.out.println(ans);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
