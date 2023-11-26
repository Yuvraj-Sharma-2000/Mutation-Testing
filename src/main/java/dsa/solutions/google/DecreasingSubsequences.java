package dsa.solutions.google;


import java.util.Arrays;

public class DecreasingSubsequences {
    public static int decreasingSubsequences(int n, int[] arr) {

        int[] used = new int[n];
        Arrays.fill(used, 1);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int index = -1;
            for (int j = 0; j < i; j++) {
                if (used[j] == 1 && arr[j] > arr[i]) {
                    if (index == -1) {
                        index = j;
                    } else {
                        if (arr[j] - arr[i] < arr[index] - arr[i]) {
                            index = j;
                        }
                    }
                }
            }

            if (index == -1)
                ans = ans + 1;
            else {
                used[index] = 0;
            }
        }

        return ans;
    }
}
