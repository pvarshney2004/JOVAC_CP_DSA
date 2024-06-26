package Class_Codes;

public class PascalTriangle {
    public static void main(String[] args) {
        int N = 5;
        for(int n = 0 ; n < N ; n++){
            int nCr = 1;
            for(int r = 0 ; r <= n ; r++){
                // BRUTE FORCE : TIME COMPLEXITY -> O(N^3)
                // int nCr = factorial(n) / ( factorial(r) * factorial(n-r));
                System.out.print(nCr + " ");

                // OPTIMAL SOLUTION : TIME COMPLEXITY -> O(N^2)
                nCr = (( n - r) * nCr) / (r + 1);
            }
            System.out.println();
        }
    }

    private static int factorial(int n){
        int fact = 1;
        while(n > 0){
            fact *= n--;
        }
        return fact;
    }
}
