package Assignment01_Maths;

public class Palindrome_Number_LC {
    public static void main(String[] args) {
        int n=-121;
        boolean ans=palindrome(n);
        System.out.println(ans);
    }
    public static boolean palindrome(int n){
        if(n<0){
            return false;
        }
        int ans=0;
        int x=n;
        while(n!=0){
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        if(x==ans){
            return true;
        }
        else{
            return false;
        }
    }
}
