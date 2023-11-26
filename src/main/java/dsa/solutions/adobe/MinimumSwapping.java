package dsa.solutions.adobe;

public class MinimumSwapping {
    public static void swap(int arr[], int i, int j) {

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int minimumSwap(int[] arr) {
        int n = arr.length;
        // We will maintain two answer, and return the minimum of them.
        int right = 0, left = 0, ans1 = 0, ans2 = 0;

        // We will create a temporary vector as we are performing swapping operations.
        int temp[] = new int[n];
        for(int i=0; i<n; i++) {
            temp[i]=arr[i];
        }
        // Firstly we will try to push all the 1s towards the left side.
        for (int i = right; i < n; i++) {

            // If there is no one at the left side then we dont need to do anything.
            if (temp[i] == 0) {
                continue;
            }

            // Count the number of zeros behind.
            for (int j = i - 1; j >= 0; j--) {
                if (temp[j] == 0) {
                    ans1++;
                } else {
                    break;
                }
            }

            // Now we will swap the current element with the element at the left index of
            // array.
            swap(temp, left, i);
            left++;
        }

        // Now we will start from the end.
        right = n - 1;
        left = n - 1;

        // Now we will try to push all the 1s towards the right side.
        for (int i = right; i >= 0; i--) {
            // If there is no one at the right side then we dont need to do anything.
            if (arr[i] == 0) {
                continue;
            }

            // Count the number of zeros ahead.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0) {
                    ans2++;
                } else {
                    break;
                }
            }

            // Now we will swap the current element with the element at the left index of
            // array.
            swap(arr, left, i);
            left--;
        }

        // Minimum of both the answer will be our final answer.
        return Math.min(ans1, ans2);
    }

}
