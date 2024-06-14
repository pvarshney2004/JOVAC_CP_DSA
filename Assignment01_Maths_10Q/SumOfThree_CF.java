package Assignment01_Maths_10Q;
import java.util.*;
//1886A
public class SumOfThree_CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int num = sc.nextInt();
            sumofThree(num);
        }
    }
    public static void sumofThree(int num){
        if(num<7 || num==9){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            if(num%3!=0){
                System.out.println("1 "+"2 "+(num-(1+2)));
            }
            else{
                System.out.println("1 "+"4 "+(num-(1+4)));
            }
        }
    }
}
