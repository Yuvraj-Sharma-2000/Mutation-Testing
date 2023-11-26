package dsa.solutions.google;

import org.apache.http.util.Asserts;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DecreasingSubsequencesTest {

    int[] x = null;

    @Test
    public void decreasingSubsequences(){
        x = new int[]{2 ,3 ,4 ,5 ,1};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(5,x),4);

        x= new int[]{2,1};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(2,x),1);

        x = new int[]{4,4,4};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(3,x),3);

        x = new int[]{5,2,5,2,8};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(5,x),3);

        x = new int[]{12 ,11 ,10 ,9 ,11 ,15 ,3 ,4};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(8,x),3);

        x = new int[]{8 ,14 ,20 ,20 ,4 ,9 ,9 ,19 ,19 ,16 ,17 ,17 ,1 ,3};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(14,x),6);

        x = new int[]{};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(0,x),0);

        x = new int[]{19 ,9 ,7 ,9 ,2 ,12 ,18 ,2 ,6 ,19 ,8 ,17 ,11 ,10};
        Assertions.assertEquals(DecreasingSubsequences.decreasingSubsequences(14,x),5);

    }
}
