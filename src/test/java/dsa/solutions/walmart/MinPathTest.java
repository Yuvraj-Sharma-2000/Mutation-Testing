package dsa.solutions.walmart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinPathTest {
    int[][] x = null;
    int n = 0;
    int expected = 0;

    @Test
    void MinPathTest(){
        x = new int[][]{{0,1},{1,2},{1,3},{2,3},{2,4},{3,4}};
        n = 5;
        expected = 3;
        Assertions.assertEquals(expected,MinPath.minPath(n,x));

        x = new int[][]{{2,3},{2,6},{0,6},{0,5},{3,4},{1,4},{1,5},{1,6}};
        n = 7;
        expected = 4;
        Assertions.assertEquals(expected,MinPath.minPath(n,x));

        x = new int[][]{{0,1}};
        n = 2;
        expected =-1 ;
        Assertions.assertEquals(expected,MinPath.minPath(n,x));

        x = new int[][]{};
        n = 1;
        expected = -1;
        Assertions.assertEquals(expected,MinPath.minPath(n,x));

        x = new int[][]{{0,5},{1,3},{4,1},{3,8},{9,1},{3,5},{6,3},{8,2},{2,4},{7,4},{2,0}};
        n = 10;
        expected = 5;
        Assertions.assertEquals(expected,MinPath.minPath(n,x));
    }
}
