package Class_Codes.Day05;

public class Number_sum {
    public static void main(String[] args) {
        int n=12345;
//        int ans=0;
//        sum(n,ans);
        System.out.println(sum(n));
    }
//    public static void sum(int n, int ans){
//        if(n==0){
//            System.out.println(ans);
//            return;
//        }
//       sum(n/10,ans+(n%10));
//    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int ans = n%10 + sum(n/10);
        return ans;
    }
}
