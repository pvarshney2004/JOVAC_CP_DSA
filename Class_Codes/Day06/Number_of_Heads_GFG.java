package Class_Codes.Day06;

public class Number_of_Heads_GFG {
    public static void main(String[] args) {
        long n = 3;
        int c=0;
        String str = "";
        while(c!=n){
            str+="T";
            c++;
        }
//        str=TTT
        String ans="";
        while(n-->0){
            int x=1;
            ans="";
            for(int i=0; i<str.length(); i++){
                if(i+1%x==0){
                    char ch=flip(str.charAt(i));
                    ans+=ch;
                }
                else{
                    ans+=str.charAt(i);
                }

            }
            x++;
        }
        System.out.println(ans);
            int p = countHead(ans);
            System.out.println(p);

    }
    public static int countHead(String ans){
        char ch = 'H';
        int count=0;
        for(int i=0; i<ans.length(); i++){
            if(ans.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static char flip(char ch){
        if(ch=='H'){
            return 'T';
        }
        return 'H';
    }
}
