package Class_Codes.Day04;

public class Longest_Substring_3{
    public static void main(String[] args) {
        String str = "abcabcda";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String str) {
        int[] arr = new int[256];
        int s=0;
        int e=0;
        int max=0;
        while(e<str.length()){
            int idx = str.charAt(e);
            arr[idx]++;
            while(arr[idx]>1){
                int idx1 = str.charAt(s);
                arr[idx1]--;
                s++;
            }
            int curr = e-s+1;
            max=Math.max(max,curr);
            e++;
        }
        return max;
    }
}
