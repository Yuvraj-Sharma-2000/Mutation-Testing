package dsa.solutions.walmart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxDiamondTest {

    int[] x = null;
    int a = 0;

    @Test
    void maxDiamond(){
        x = new int[]{1 ,2 ,3 ,4 ,5};
        a = 5;
        Assertions.assertEquals(9,MaxDiamond.diamondForPrincess(x,a));

        x = new int[]{1 ,1 ,1 ,1 ,1};
        a = 5;
        Assertions.assertEquals(3,MaxDiamond.diamondForPrincess(x,a));

        x = new int[]{1 ,2};
        a = 2;
        Assertions.assertEquals(2,MaxDiamond.diamondForPrincess(x,a));

        x = new int[]{44 ,34 ,96 ,36 ,69 ,59 ,32 ,67 ,75 ,76 ,68 ,17 ,97};
        a = 13;
        Assertions.assertEquals(481,MaxDiamond.diamondForPrincess(x,a));

        x = new int[]{62 ,74 ,51 ,70 ,40 ,31 ,69 ,59 ,100 ,33 ,26 ,11 ,72 ,70 ,23};
        a = 15;
        Assertions.assertEquals(443,MaxDiamond.diamondForPrincess(x,a));


    }
}
