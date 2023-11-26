package dsa.solutions.goldmansachs;

public class PrimeAndValidity {
    public static boolean isPrime(int n) {
        for(int i = 2; i * i <= n; ++i)
            // Check condition.
            if(n % i == 0)
                return false;
        return true;
    }
    public static int isValid(int n, int k)
    {
        // Base case.
        if(n < 2*k)
            return 0;

        // Base case.
        if(k == 1)
            return (isPrime(n)) ? 1 : 0;
        if(k == 2) {

            // Check condition.
            if(n % 2 == 0) {
                return 1;
            }

            return (isPrime(n-2))?1:0;
        }
        return 1;
    }
}