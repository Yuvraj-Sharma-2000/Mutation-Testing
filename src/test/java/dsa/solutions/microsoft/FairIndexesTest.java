package dsa.solutions.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairIndexesTest {
    int[] x = null;
    int[] y = null;
    @Test
    void totalIndexes() {
        x = new int[]{1, 2, 3};
        y = new int[]{2, 1, 3};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),1);

        x = new int[]{6,6};
        y = new int[]{10,2};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),0);

        x = new int[]{-5 ,2 ,-10 ,-3 ,6};
        y = new int[]{-5 ,-10 ,3 ,4 ,-2};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),1);

        x = new int[]{1 ,4 ,2 ,-2 ,5 };
        y = new int[]{7 ,-2 ,-2 ,2 ,5 };
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),2);

        x = new int[]{0,0,0,0,0,0,0,0,0,0};
        y = new int[]{-10 ,10 ,8 ,-8 ,-4 ,4 ,6 ,-6 ,7 ,-7};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),4);

        x = new int[]{0,0,0,0,0,0,0,0,0,0};
        y = new int[]{0,0,0,0,0,0,0,0,0,0};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),9);

        x = new int[]{-10 ,10 ,8 ,-8 ,-4 ,4 ,6 ,-6 ,7 ,-7};
        y = new int[]{-10 ,10 ,8 ,-8 ,-4 ,4 ,6 ,-6 ,7 ,-7};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),4);

        x = new int[]{1,1,1,1,1,1,1,1,1,1};
        y = new int[]{1,1,1,1,1,1,1,1,1,1};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),1);

        x = new int[]{141 ,0 ,20 ,-15 ,35 ,-27 ,128 };
        y = new int[]{141 ,0 ,-9 ,27 ,29 ,-29 ,123};
        Assertions.assertEquals(FairIndexes.totalIndexes(x,y),2);
    }
}