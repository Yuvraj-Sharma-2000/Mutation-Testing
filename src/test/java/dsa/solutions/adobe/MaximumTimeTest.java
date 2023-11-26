package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTimeTest {
    int[][] arr = null;
    @Test
    void maxTime() {
        arr = new int[][]{
                {2, 0},
                {0, 2},
                {0, 0}
        };
        assertEquals(MaximumTime.maxTime(3,2,arr), 1.4142135623730951);

        arr = new int[][]{
                {1, 0},
                {0, 0},
                {2, 0}
        };
        assertEquals(MaximumTime.maxTime(3,1,arr), 2.000000);

        arr = new int[][]{
                {0, 2},
                {0, 3},
                {0, 4},
                {0, 1}
        };
        assertEquals(MaximumTime.maxTime(4,2,arr), 1.500000);

        arr = new int[][]{
                {0, 0},
                {1, 0}
        };
        assertEquals(MaximumTime.maxTime(2,2,arr), 0.500000);
    }
}