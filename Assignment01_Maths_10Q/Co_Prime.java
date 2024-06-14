package Assignment01_Maths_10Q;

public class Co_Prime {
    public static void main(String[] args) {
        int[] arr = {5,10,20};
        System.out.println(coPrime(arr));
    }
    public static int coPrime(int[] arr){
        int c=0;
        for(int i=1; i<arr.length; i++){
            if(gcd(arr[i],arr[i-1])!=1){
                c++;
            }
        }
        return c;

    }
    public static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(a==0){
            return b;
        }
        return a;

    }
}
