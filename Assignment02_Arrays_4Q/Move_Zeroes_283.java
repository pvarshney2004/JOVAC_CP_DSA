package Assignment02_Arrays_4Q;
import java.util.*;
public class Move_Zeroes_283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums){
        int c = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                c++;
            }
            else if (c > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-c]=t;
            }
        }

    }
}
