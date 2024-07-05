package Class_Codes.Day08;

public class Place_a_and_b {
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean[] arr = new boolean[n];
        print(arr,q,"",0);
    }
    public static void print(boolean[] arr, int q, String ans, int p){
        if(p==q){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==false){
                arr[i]=true;
                print(arr,q,ans+"c"+(i+1)+"p"+(p+1),p+1);
                arr[i]=false;
            }
        }
    }
}
