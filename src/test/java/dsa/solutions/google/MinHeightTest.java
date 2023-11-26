package dsa.solutions.google;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinHeightTest {

    int[][] x = null;
    int[] ans = null;

    @Test
    void minHeightTest(){

        x = new int[][]{{1,2},{3,1},{4,1}};
        ans = new int[]{1};
        Assertions.assertArrayEquals(ans,MinHeight.minHeightRoots(x));

        x = new int[][]{{1,3},{2,3},{4,1},{5,1}};
        ans = new int[]{1,3};
        Assertions.assertArrayEquals(ans,MinHeight.minHeightRoots(x));

        x = new int[][]{{2,1},{1,4},{4,3},{4,5}};
        ans = new int[]{1,4};
        Assertions.assertArrayEquals(ans,MinHeight.minHeightRoots(x));

        x = new int[][]{{1,2},{2,3},{2,4},{4,5},{4,6}};
        ans = new int[]{2,4};
        Assertions.assertArrayEquals(ans,MinHeight.minHeightRoots(x));

    }
}
