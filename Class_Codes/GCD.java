package Class_Codes;

public class GCD {
    public static void main(String[] args) {
        int a=1409286144;
        int b=3628800;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        if(a==0) return b;
        else return a;
    }
}
