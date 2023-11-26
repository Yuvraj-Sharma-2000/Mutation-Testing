package dsa.solutions.adobe;

public class MinimumDeletions {
    private static int helper(String str, int index, int n, int del) {

        // Base case: if index reaches the end, we will return our deletion operations.
        if (index == n) {
            return del;
        }

        int ans;

        // If current character is 'a', then add it to our answer and call at index+1.
        if (str.charAt(index) == 'a') {
            ans = helper(str, index + 1, n, del);
        }

        // If current character is 'b', then we have two options.
        else {
            int count = 0;

            // Counting the number of 'a' ahead.
            for (int i = index + 1; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    count++;
                }
            }

            ans = Math.min(del + count, helper(str, index + 1, n, del + 1));
        }

        // Returning the updated answer.
        return ans;
    }

    public static int minDeletions(String str) {

        // Calling helper function
        int ans = helper(str, 0, str.length(), 0);

        // Return the final ans.
        return ans;
    }
}
