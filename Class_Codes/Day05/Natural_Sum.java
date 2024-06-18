package Class_Codes.Day05;

public class Natural_Sum {
    public static void main(String[] args) {
        int n=5;
        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
//        System.out.println(n);
        int ans = n+sum(n-1);
//        System.out.println(n);
        return ans;
    }
}
