package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwappingTest {

    @Test
    void minimumSwap() {
        assertEquals(MinimumSwapping.minimumSwap(new int[]{}),0);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{1,0,1,1}), 1);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{0,1,1}), 0);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{1,0,0,1,1}), 2);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{0,0,0,1,0,0}), 2);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{0 ,1 ,1 ,0 ,0 ,1 ,0 ,1 ,1 ,0 ,0 ,1 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,1 ,0 ,0 ,0, 0, 0 }), 54);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{0 ,1 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,0 ,1}),37);
        assertEquals(MinimumSwapping.minimumSwap(new int[]{1 ,1 ,1 ,1 ,0 ,0 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,1 ,0}), 38);
    }
}