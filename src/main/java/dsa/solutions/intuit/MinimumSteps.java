package dsa.solutions.intuit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class MinimumSteps {
    static int MAX = (int) 1e6;

    // Function to get all the prime numbers from 1 to N using seive of eratosthenes
    private static ArrayList<Integer> getPrimes(int n) {
        boolean primes[] = new boolean[n + 1];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == false) {
                continue;
            }

            for (int j = i * i; j <= n; j += i) {
                primes[j] = false;
            }
        }

        // Return the list of prime numbers.
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (primes[i] == true) {
                res.add(i);
            }
        }

        return res;
    }

    // Function to get the sum of digits of a number from 1 to N.
    private static Integer digitalSum(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 9 == 0) {
            return 9;
        }

        return num % 9;
    }

    private static int util(int currentPos, int curr, int n, HashSet<Integer> mineSet, int l,
                            HashMap<Integer, Integer> primeDict) {
        // Base cases.
        if (mineSet.contains(currentPos)) {
            return MAX;
        }

        if (currentPos == n) {
            return 0;
        }

        if (currentPos > n) {
            return MAX;
        }

        curr = Math.min(curr, l);

        // If a special move is not allowed move one or two positions ahead.
        if (!primeDict.containsKey(currentPos) || curr < l) {
            return Math.min(util(currentPos + 1, curr + 1, n, mineSet, l, primeDict),
                    util(currentPos + 2, curr + 1, n, mineSet, l, primeDict)) + 1;
        }

        // Otherwise try making a special move also.
        else {
            return Math.min(
                    Math.min(util(currentPos + 1, curr + 1, n, mineSet, l, primeDict),
                            util(currentPos + 2, curr + 1, n, mineSet, l, primeDict)),
                    util(currentPos + primeDict.get(currentPos), 0, n, mineSet, l, primeDict)) + 1;
        }

    }

    public static long moveSteps(int n, int[] mines, int l) {
        HashSet<Integer> mineSet = new HashSet<>();

        for (int pos : mines) {
            mineSet.add(pos);
        }

        HashMap<Integer, Integer> primeDict = new HashMap<>();

        // Get the primes numbers upto the maxium range of N.
        ArrayList<Integer> primeNumbers = getPrimes(100010);

        for (int i = 0; i < primeNumbers.size() - 1; i++) {
            int num = i + (primeNumbers.get(i + 1) - primeNumbers.get(i));
            primeDict.put(primeNumbers.get(i), digitalSum(num));

        }

        int[][] memo = new int[n + 1][l + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }

        // Call the Utility function with starting position of 1 and L.
        int ans = util(1, l, n, mineSet, l, primeDict);
        if (ans >= MAX) {
            return -1;
        }

        return ans;
    }

}
