package Assignment01_Maths_10Q;

public class Reverse_Integer_LC {
    public static void main(String[] args) {
        int n = -123;
        int ans = reverse(n);
        System.out.println(ans);
    }
    public static int reverse(int n){
        long rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
    }
}
