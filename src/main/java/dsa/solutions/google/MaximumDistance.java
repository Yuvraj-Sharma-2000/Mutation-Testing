package dsa.solutions.google;

public class MaximumDistance {

    public static int calculateDistance(String firstString, String secondString) {
        int i, j;
        i = j = 0;

        while (i < firstString.length() && j < secondString.length()) {
            // If at any position the characters are not equal we break the loop
            if (firstString.charAt(i) != secondString.charAt(j)) {
                break;
            }

            i += 1;
            j += 1;
        }

        // Return the distance at which both strings became unequal
        return firstString.length() - i + secondString.length() - j;
    }

    public static int maximumDistance(String[] arr) {
        int maxDistance = 0;

        // For each string iterate over every string
        for (int i = 0; i < arr.length; i++) {
            String firstString = arr[i];

            for (int j = 0; j < arr.length; j++) {
                String secondString = arr[j];

                /// Update the maximum distance
                maxDistance = Math.max(maxDistance, calculateDistance(firstString, secondString));
            }
        }

        // Return the maxDistance
        return maxDistance;
    }
}
