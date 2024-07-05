package LeetCode;

public class GetMaximumScore_1537 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,8,10};
        int[] arr2 = {4,6,8,9};
        int ans = maxPathSum(arr1, arr2);
        System.out.println(ans);
    }
    public static int maxPathSum(int[] arr1, int[] arr2){
        int i=0,j=0,s1=0,s2=0,ans=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                int sum1=0;
                for(int k=s1; k<=i; k++){
                    sum1+=arr1[k];
                }
                int sum2=0;
                for(int k=s2; k<=j; k++){
                    sum2+=arr2[k];
                }
                ans = ans+Math.max(sum1,sum2);
                i++;
                j++;
                s1=i;
                s2=j;
            }
        }
        int sum1=0;
        for(int k=s1; k<arr1.length; k++){
            sum1+=arr1[k];
        }
        int sum2=0;
        for(int k=s2; k<arr2.length; k++){
            sum2+=arr2[k];
        }
        ans = ans+Math.max(sum1,sum2);
        return ans;
    }
}
