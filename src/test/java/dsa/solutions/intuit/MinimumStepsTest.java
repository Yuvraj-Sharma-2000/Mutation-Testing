package dsa.solutions.intuit;

import com.jayway.jsonpath.internal.function.numeric.Min;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumStepsTest {

    @Test
    void moveSteps() {
        assertEquals(MinimumSteps.moveSteps(10,new int[]{6},2),4);
        assertEquals(MinimumSteps.moveSteps(11,new int[]{8},2),4);
        assertEquals(MinimumSteps.moveSteps(15,new int[]{11,14},1) ,7);
        assertEquals(MinimumSteps.moveSteps(11,new int[]{8,11},3) ,-1);
        assertEquals(MinimumSteps.moveSteps(15,new int[]{11,13,15},2) ,-1);
        assertEquals(MinimumSteps.moveSteps(22,new int[]{13,14,17},3) ,-1);
        assertEquals(MinimumSteps.moveSteps(12,new int[]{4,6,12},4) ,-1);
        assertEquals(MinimumSteps.moveSteps(20,new int[]{17},2) ,7);
        assertEquals(MinimumSteps.moveSteps(30,new int[]{16},4) ,11);
    }
}