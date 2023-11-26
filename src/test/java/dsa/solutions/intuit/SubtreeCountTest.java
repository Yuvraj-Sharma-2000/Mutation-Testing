package dsa.solutions.intuit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeCountTest {

    @Test
    void subtreeCount() {
        assertArrayEquals(SubtreeCount.subtreeCount(new int[]{1,2,2,1}), new int[]{2,1});
        assertArrayEquals(SubtreeCount.subtreeCount(new int[]{1,2,2,3,3,1}), new int[]{3,1,1});
        assertArrayEquals(SubtreeCount.subtreeCount(new int[]{1,2,3,3,2,1}), new int[]{3,2,1});
        assertArrayEquals(SubtreeCount.subtreeCount(new int[]{1,2,3,3,2,4,4,1}), new int[]{4,2,1,1});
        assertArrayEquals(SubtreeCount.subtreeCount(new int[]{1,5,10,9,9,10,5,6,8,4,7,2,3,3,2,11,11,7,4,8,6,1}), new int[]{11,2,1,5,3,7,4,6,1,2,1});
        assertArrayEquals(SubtreeCount.subtreeCount(new int[]{1,8,9,9,10,2,2,5,5,7,4,3,6,6,3,4,7,10,8,1}), new int[]{10,1,2,3,1,1,4,9,1,7});
    }
}