package dsa.solutions.microsoft;

public class TakeAwayTheBottle {
    public static int help(int i, int j, int[] arr) {
        // Base cases, if range size is 0, or 1.
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }

        // If first and second bottles are not same.
        if (arr[i] != arr[i + 1]) {
            // Since the bottles are not same, therefore we add 1 and continued with rest of array.
            int ans = 1 + help(i + 1, j, arr);

            // Finding an index 'k' to try for every range
            for (int k = i + 1; k <= j; k++) {
                if (arr[i] == arr[k]) {
                    ans = Math.min(ans, help(i + 1, k - 1, arr) + help(k + 1, j, arr));
                }
            }

            // Returning the final minimum ans
            return ans;

        } else {
            // Since the bottles are same, therefore we can add 1 and call on (i + 2, j) as well.
            int ans = 1 + help(i + 1, j, arr);
            ans = Math.min(ans, 1 + help(i + 2, j, arr));

            // Finding an index 'k' to try for every range
            for (int k = i + 2; k <= j; k++) {
                if (arr[i] == arr[k]) {
                    ans = Math.min(ans, help(i + 1, k - 1, arr) + help(k + 1, j, arr));
                }
            }

            // Returning the final minimum ans
            return ans;

        }
    }
    public static int takeAwayTheBottle(int[] arr) {
        int n = arr.length;
        // Since we need start point and end point, we called a helper function named help
        return help(0, n - 1, arr);
    }
}
