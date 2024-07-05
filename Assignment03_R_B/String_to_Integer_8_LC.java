package Assignment03_R_B;

public class String_to_Integer_8_LC {
    public static void main(String[] args) {
        String str = "-012134";
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0){
            return 0;
        }
        char firstChar = str.charAt(0);
        int sign=1;
        int start=0;
        if(firstChar=='+'){
            sign=1;
            start++;
        }
        else if(firstChar=='-'){
            sign=-1;
            start++;
        }
        long ans=0;
        for(int i=start; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                return (int) ans * sign;
            }
            ans = ans*10 + (ch-'0');
            if(sign==1&&ans>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1&&(-1)*ans<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)ans*sign;
    }
}

