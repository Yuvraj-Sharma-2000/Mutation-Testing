package dsa.solutions.intuit;

public class KPalindrome {
    public static boolean isPalindrome(int k, String str) {

        // Take a copy of the current string and reverse it.
        String cpy;

        StringBuffer temp = new StringBuffer(str);
        temp.reverse();
        cpy = new String(temp);

        int n = str.length();

        // Function call.
        int ans = isPalindromeHelper(str, cpy, n, n);

        if (ans <= 2 * k) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int isPalindromeHelper(String str, String cpy, int n, int m) {
        // Base Case.
        if (n == 0) {
            return m;
        }

        if (m == 0) {
            return n;
        }

        // Check if the current elements are equal.
        if (str.charAt(n - 1) == cpy.charAt(m - 1)) {
            return isPalindromeHelper(str, cpy, n - 1, m - 1);
        }
        else {
            return Math.min(isPalindromeHelper(str, cpy, n - 1, m),
                    isPalindromeHelper(str, cpy, n, m - 1)) + 1;
        }
    }
}
