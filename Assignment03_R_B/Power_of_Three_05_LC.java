package Assignment03_R_B;

public class Power_of_Three_05_LC {
    //326
    public static void main(String[] args) {
        int n=0;
//        boolean ans = check(n,0);
        boolean ans = check(n);
        System.out.println(ans);
    }
//    public static boolean check(int n, int idx){
//        if(Math.pow(3,idx)==n){
//            return true;
//        }
//        else if(Math.pow(3,idx)>n){
//            return false;
//        }
//        return check(n,idx+1);
//    }
    public static boolean check(int n) {
        if (n == 1) {
            return true;
        }
        if(n<=0 || n%3!=0){
            return false;
        }
        return check(n/3);
    }
}
