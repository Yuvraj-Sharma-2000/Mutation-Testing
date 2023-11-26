package dsa.solutions.adobe;

public class ChristmasAtOffice {
    public static int totalStrings(String s) {

        // To store the count of characters present in the string.
        int[] counter = new int[26];
        for (int i = 0; i < 26; i++) {
            counter[i] = 0;
        }
        int i = 0, j = 0, elementCount = 0, k = 2;

        // To store the count of elements greater than 2.
        int greater = 0;

        int n = s.length();
        while (i < n) {

            // Increment the current element in the counter array.
            counter[s.charAt(i) - 'a']++;

            // If we encounter a new Element, update elementCount.
            if (counter[s.charAt(i) - 'a'] == 1) {
                elementCount++;
            }

            /*
                If the total number of elements in the current
                substring is greater than 2.
            */
            if (elementCount > k) {

                while (elementCount > k) {
                    counter[s.charAt(j) - 'a']--;

                    /*
                       If the count of a certain element equals
                       0, decrement elementCount.
                    */
                    if (counter[s.charAt(j) - 'a'] == 0) {
                        elementCount--;
                    }
                    j++;
                }

                // Update count of all the elements having more than 2 characters.
                greater += j;
                j--;
                counter[s.charAt(j) - 'a']++;
                if (counter[s.charAt(j) - 'a'] == 1) {
                    elementCount++;
                }
            }
            i++;
        }
        return n * (n + 1) / 2 - greater;
    }
}
