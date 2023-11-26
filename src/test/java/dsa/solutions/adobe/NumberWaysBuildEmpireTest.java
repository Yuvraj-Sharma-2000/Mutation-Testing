package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberWaysBuildEmpireTest {

    @Test
    void waysToBuildEmpire() {
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1,0,0,1}), 3);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1,0,1,2}), 1);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1 ,0 ,0 ,1 ,2 ,3 ,3 ,4}), 70);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1 ,0 ,0 ,1 ,2 ,3 ,3 ,4 ,5 ,5 ,6 ,6}), 13200);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1,0,0,0,0}), 24);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1,0,1,2,1}), 3);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1 ,0 ,0 ,1 ,2 ,2 ,2 ,2 ,1 ,2}), 20160);
        assertEquals(NumberWaysBuildEmpire.waysToBuildEmpire(new int[]{-1 ,0 ,1 ,0 ,2, 2 ,3 ,5 ,2 ,6}), 1008);
    }
}