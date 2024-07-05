package Class_Codes.Day09;
import java.util.Arrays;
public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[]a1 = {1,1,2};
        int[]a2 = {2,3,5};
        int[]ans = merge(a1,a2);
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] merge(int[]a1, int []a2){
        int n = a1.length,m = a2.length;
        int[]ans = new int[n+m];
        int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                ans[k++]=a1[i++];
            }
            else{
                ans[k++]=a2[j++];
            }
        }
        while(i<a1.length){
            ans[k++]=a1[i++];
        }
        while(j<a2.length){
            ans[k++]=a2[j++];
        }
        return ans;
    }
}
