package dsa.solutions.goldmansachs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReachingPointsTest {

    @Test
    void isReachable() {
        assertTrue(ReachingPoints.isReachable(1, 1, 5, 8));
        assertFalse(ReachingPoints.isReachable(3, 5, 7, 9));
        assertTrue(ReachingPoints.isReachable(1, 1, 1, 1000));
        assertTrue(ReachingPoints.isReachable(1, 1, 1000, 1));
        assertFalse(ReachingPoints.isReachable(44, 11, 71, 67));
        assertFalse(ReachingPoints.isReachable(30, 57, 12, 50));
        assertFalse(ReachingPoints.isReachable(17, 17, 41, 64));
        assertFalse(ReachingPoints.isReachable(45, 93, 29, 7));
        assertFalse(ReachingPoints.isReachable(82, 44, 64, 61));
        assertFalse(ReachingPoints.isReachable(83, 87, 36, 58));
        assertFalse(ReachingPoints.isReachable(8, 93, 66, 31));
        assertFalse(ReachingPoints.isReachable(7, 89, 11, 41));
        assertFalse(ReachingPoints.isReachable(41, 13, 77, 95));
    }
}