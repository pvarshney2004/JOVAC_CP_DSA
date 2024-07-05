package Assignment03_R_B;

public class Power_of_Four_06_LC {
    //342
    public static void main(String[] args) {
        int n=16;
        System.out.println(check(n));
    }
    public static boolean check(int n){
        if(n==1){
            return true;
        }
        else if(n<=0 && n%4!=0) {
            return false;
        }
        return check(n/4);
    }
}
