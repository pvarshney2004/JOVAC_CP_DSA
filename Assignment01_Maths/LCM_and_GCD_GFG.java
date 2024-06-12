package Assignment01_Maths;

import java.util.Arrays;

public class LCM_and_GCD_GFG {
    public static void main(String[] args) {
        Long a = 5l;
        Long b =10l;
        Long[] ans = lcmAndGcd(a,b);
        System.out.println(Arrays.toString(ans));

    }
    public static Long[] lcmAndGcd(Long x , Long y){
        Long a=x;
        Long b=y;
        Long[] ans = new Long[2];
        int gcd=0;
        while(a!=0 && b!=0){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(a==0){
            ans[1]=b;
        }
        else{
            ans[1]=a;
        }

        a=x;
        b=y;
        Long lcm = (a * b) / ans[1];
        ans[0]=lcm;
        return ans;
    }
}
