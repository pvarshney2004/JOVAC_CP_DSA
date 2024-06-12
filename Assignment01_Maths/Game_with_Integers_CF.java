package Assignment01_Maths;
import java.util.*;
public class Game_with_Integers_CF {
    //1899A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ques(n);
        }
    }
    public static void ques(int n){
        if(n%3!=0){
            System.out.println("First");
        }
        else{
            System.out.println("Second");
        }
    }
}
