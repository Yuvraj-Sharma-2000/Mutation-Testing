package dsa.solutions.walmart;
public class MaxDiamond {

    static int maxDiamondRec(int i, boolean flag, int[] diamond, int currSum) {

        // Create a variable denoting size of the array.
        int n = diamond.length;

        // If we are out the index of the array.
        // Return currSum.
        if (i == n) {
            return currSum;
        }


        int x = maxDiamondRec(i + 1, true, diamond, currSum);

        // Create another variable y with initial value equal to zero.
        int y = 0;


        if (flag) {
            y = maxDiamondRec(i + 1, false, diamond, currSum + diamond[i]);
        }

        // Return the max of x,y.
        return Math.max(x, y);
    }

    static int diamondForPrincess(int[] diamond, int n) {

        // Call the maxDiamondRec function with current index(i) = 0, flag = true, currSum = 0.
        return maxDiamondRec(0, true, diamond, 0);
    }
}