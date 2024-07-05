package LeetCode;

public class Find_Peak_162 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                return i;
            }
        }
        return 0;
    }
}
