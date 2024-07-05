package Class_Codes.Day08;

public class Place_a_and_b_dup_remove {
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean[] arr = new boolean[n];
        print(arr,q,"",0,0);
    }
    public static void print(boolean[] arr, int q, String ans, int p, int idx){
        if(p==q){
            System.out.println(ans);
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(!arr[i]){
                arr[i]=true;
                print(arr,q,ans+"c"+(i+1)+"p"+(p+1),p+1,i+1);
                arr[i]=false;
            }
        }
    }
}
