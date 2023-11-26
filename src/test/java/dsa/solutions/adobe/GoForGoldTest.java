package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoForGoldTest {
    @Test
    void goForGold() {
        int[][] numbers = {
                {0, 1, 1, 2, 0},
                {2, 2, 1, 1, 2},
                {0, 0, 1, 2, 0},
                {0, 1, 1, 0, 0}
        };
        assertEquals(GoForGold.goForGold(numbers, 2, 1), 9);

        numbers = new int[][]{
                {0, 0, 1}
        };
        assertEquals(GoForGold.goForGold(numbers, 0, 1), 3);

        numbers = new int[][]{
                {0, 2, 0},
                {2, 0, 0},
                {0, 0, 0}
        };
        assertEquals(GoForGold.goForGold(numbers, 1, 1), -1);

        numbers = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertEquals(GoForGold.goForGold(numbers, 2, 2), 4);

        numbers = new int[][]{
                {1, 0, 1, 0, 1},
                {0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0},
                {1, 2, 1, 2, 1}
        };
        assertEquals(GoForGold.goForGold(numbers, 0, 4), 28);

        numbers = new int[][]{
                {1, 0, 1, 0, 1},
                {0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0},
                {1, 2, 1, 0, 1}
        };
        assertEquals(GoForGold.goForGold(numbers, 0, 4), 20);
    }
}