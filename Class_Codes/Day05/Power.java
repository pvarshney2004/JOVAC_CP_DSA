package Class_Codes.Day05;

public class Power {
    public static void main(String[] args) {
        int x=3;
        int n=-2;
        int ans = pow(x,n);
        System.out.println(ans);
    }
//    public static double pow(int x, int n){
//        if(n==0){
//            return 1;
//        }
//        boolean flag=false;
//        if(n<0){
//            n*=-1;
//            flag=true;
//        }
//        double ans = x*pow(x,n-1);
//        if(flag){
//            return 1/ans;
//        }
//        return ans;
//    }

    //binary exponentiation
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        int c=b;
        b=b/2;
        int ans = a*pow(a,b-1);
        int out = ans*ans;
        int out1= ans*ans*a;
        //checking power even or odd
        if(c%2==0){
            return out;
        }
        return out1;
    }
}
