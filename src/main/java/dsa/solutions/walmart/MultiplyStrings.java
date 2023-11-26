package dsa.solutions.walmart;

public class MultiplyStrings {

    // Function for finding two numbers represented as strings
    private static String add(String a, String b) {

        // Checking whether string a is larger than string b
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        // Initializing result string

        StringBuilder answer = new StringBuilder();

        // Calculating length of the two strings
        int l1 = a.length(), l2 = b.length();

        StringBuilder tempA = new StringBuilder();
        tempA.append(a);

        StringBuilder tempB = new StringBuilder();
        tempB.append(b);

        // Reversing the two strings
        a = tempA.reverse().toString();
        b = tempB.reverse().toString();

        // Using elementary addition to add digit by digit
        int carry = 0;
        for (int i = 0; i < l1; i++) {

            // Computing sum of digits
            int sum = ((a.charAt(i) - '0') + (b.charAt(i) - '0') + carry);

            // Adding sum to answer
            answer.append(sum % 10);

            // Calculating carry for next set of digits
            carry = sum / 10;
        }

        // Adding the digits not added above
        for (int i = l1; i < l2; i++) {

            // Calculating sum of digit and carry
            int sum = ((b.charAt(i) - '0') + carry);

            // Adding sum to answer
            answer.append(sum % 10);

            // Carry addition
            carry = sum / 10;

        }

        // Add carry if it is present
        if (carry > 0) {
            answer.append(carry);
        }

        return answer.reverse().toString();
    }

    // Function to multiply string and a digit
    private static String multiplyWithDigit(String a, int b) {

        // Initializing carry and answer
        int carry = 0;
        StringBuilder answer = new StringBuilder();

        // Iterating digit by digit and multiplying
        for (int i = a.length() - 1; i >= 0; i--) {

            // Calculating result and adding to answer
            int p = (a.charAt(i) - '0') * b + carry;

            answer.append(p % 10);

            // Updating carry
            carry = p / 10;

        }

        // Adding final carry if it exists
        if (carry > 0) {
            answer.append(carry);
        }

        // Reversing final answer and returning it
        return answer.reverse().toString();
    }

    public static String multiplyStrings(String a, String b) {

        // Finding the rightmost digit of b and multiplying with a
        int p = b.charAt(b.length() - 1) - '0';
        int q = a.charAt(a.length() - 1) - '0';

        // Check if 2nd number is Zero
        if ((p == 0 && b.length() == 1) || (q == 0 && a.length() == 1)) {
            return "0";
        }
        String answer = multiplyWithDigit(a, p);

        // Checking if it is the last digit
        if (b.length() > 1) {

            // Multiplying recursively
            String l = multiplyStrings(a, b.substring(0, b.length() - 1));

            // Multiplying by 10
            l += "0";

            // Adding both the results
            answer = add(answer, l);

        }

        // returning result
        return answer;

    }

}