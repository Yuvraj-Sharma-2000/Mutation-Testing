package dsa.solutions.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMinimumLengthTest {

    @Test
    void minimumDifference() {
        Assertions.assertEquals(FindTheMinimumLength.minimumDifference(new int[]{1,3,2,4}),2);
        Assertions.assertEquals(FindTheMinimumLength.minimumDifference(new int[]{2,6,5,1,9,10}),4);
        Assertions.assertEquals(FindTheMinimumLength.minimumDifference(new int[]{1,2,3,4,5}),0);
        Assertions.assertEquals(FindTheMinimumLength.minimumDifference(new int[]{1,3,4,2,5,6,7}),3);
        Assertions.assertEquals(FindTheMinimumLength.minimumDifference(new int[]{1,2,3,4,5,6,8,8,13 ,8, 14, 13, 10, 9 ,13 ,15 ,17 ,18 ,19 ,20 ,21 ,22 ,23 ,24 ,25 ,26}),7);
    }
}