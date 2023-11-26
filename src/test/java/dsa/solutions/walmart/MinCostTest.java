package dsa.solutions.walmart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCostTest {

    int[] x = null;
    int expected = 0;

    @Test
    void minCostTest(){

        x = new int[]{20 ,10 ,4 ,50 ,100};
        expected = 14;
        Assertions.assertEquals(expected,MinCost.minCostToBuyOranges(x,5));

        x = new int[]{-1 ,-1 ,4 ,5 ,-1};
        expected = -1;
        Assertions.assertEquals(expected,MinCost.minCostToBuyOranges(x,5));

        x = new int[]{-1 ,2 ,1 ,3 ,5};
        expected = 10;
        Assertions.assertEquals(expected,MinCost.minCostToBuyOranges(x,25));

        x = new int[]{718166 ,852709 ,799702 ,38605 ,567792 ,178044 ,907339 ,348948 ,520500 ,784250};
        expected = 602699;
        Assertions.assertEquals(expected,MinCost.minCostToBuyOranges(x,50));

        x = new int[]{-1 ,-1 ,846178 ,58183 ,993939 ,720190 ,651328 ,769160 ,-1 ,874158 ,600933 ,379581 ,847961 ,425688 ,394120 ,-1};
        expected = 936174;
        Assertions.assertEquals(expected,MinCost.minCostToBuyOranges(x,37));

    }

}
