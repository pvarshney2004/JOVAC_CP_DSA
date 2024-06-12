package Assignment01_Maths;

public class Armstrong_Number_GFG {
    public static void main(String[] args) {
        int n=153;
        String ans = isArmstrong(n);
        System.out.println(ans);
    }
    //only for 3-digit number
    public static String isArmstrong(int n){
        int x=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=(rem*rem*rem);
            n/=10;
        }
        if(ans==x){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
