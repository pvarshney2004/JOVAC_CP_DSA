package Assignment03_R_B;

public class power_of_two_02_LC {
    public static void main(String[] args) {
        int n=15;
        boolean ans = check(n,0);
        System.out.println(ans);
    }
    public static boolean check(int n, int idx){
        if(Math.pow(2,idx)==n){
            return true;
        }
        else if(Math.pow(2,idx)>n){
            return false;
        }
        return check(n,idx+1);
    }
}
