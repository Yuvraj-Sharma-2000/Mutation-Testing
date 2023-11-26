package dsa.solutions.goldmansachs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class GardenFencingTest {
    int[][] trees = null;
    double[] ans = null;
    double[] fencing = null;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Test
    void gardenFencing() {
        trees = new int[][]{{0, 0}, {1, 0}, {2, 0}};
        ans = new double[]{1.00000 ,0.00000 ,1.00000 };
        assertArrayEquals(GardenFencing.gardenFencing(3, trees), ans);

        trees = new int[][]{{1,0}, {0,-1}, {-1,0}, {0,1}};
        ans = new double[]{0.00000, 0.00000, 1.00000 };
        assertArrayEquals(GardenFencing.gardenFencing(4, trees), ans);

        trees = new int[][]{{1,1}, {2,0}, {2,2},{2,4}, {3,3}, {4,2}};
        ans = new double[]{2.00000 ,2.00000 ,2.00000 };
        assertArrayEquals(GardenFencing.gardenFencing(6, trees), ans);

        trees = new int[][]{{1,1}, {0,2}, {2,2}, {2,4}, {3,3}, {4,2}};
        ans = new double[]{2.00000 ,2.00000 ,2.00000 };
        assertArrayEquals(GardenFencing.gardenFencing(6, trees), ans);

        trees = new int[][]{{-10,-72}, {6,94}, {84,51}, {96,2}, {49,-99}, {-80,-65}, {-37,-47}, {9,18}};
        ans = new double[]{4.07 ,-7.71 ,101.73};
        fencing = GardenFencing.gardenFencing(8, trees);
        for (int i=0; i< fencing.length; i++)
                fencing[i] = ((int)(Float.parseFloat(decimalFormat.format(fencing[i]))*1e2))/1e2;
        assertArrayEquals(fencing, ans);

        trees = new int[][]{{-56,52},{-54,-23},{14,31}};
        ans = new double[]{-28.89113 ,15.19624, 45.71004 };
        fencing = GardenFencing.gardenFencing(3, trees);
        for (int i=0; i< fencing.length; i++)
            fencing[i] = ((int)(Float.parseFloat(decimalFormat.format(fencing[i]))*1e2))/1e2;
        assertArrayEquals(fencing, ans);

        trees = new int[][]{{57,-71},{-90,93},{76,-26},{30,93}};
        ans = new double[]{-16.50000, 11.00000 ,110.11925 };
        fencing = GardenFencing.gardenFencing(4, trees);
        for (int i=0; i< fencing.length; i++)
            fencing[i] = ((int)(Float.parseFloat(decimalFormat.format(fencing[i]))*1e2))/1e2;
        assertArrayEquals(fencing, ans);
    }
}