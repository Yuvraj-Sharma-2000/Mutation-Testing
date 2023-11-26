package dsa.solutions.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeAwayTheBottleTest {

    @Test
    void takeAwayTheBottle() {
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{8 ,5 ,1 ,3 ,10}), 5);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{10 ,8 ,6 ,2}), 4);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{2 ,6 ,5 ,2}), 2);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{1 ,2 ,3 ,5}), 4);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{1 ,5, 10, 13, 15}), 5);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{6 ,6, 6, 6}), 1);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{10 ,8, 7, 4, 1}), 5);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{5}), 1);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{3 ,4 ,8 ,4 ,3}), 1);
        Assertions.assertEquals(TakeAwayTheBottle.takeAwayTheBottle(new int[]{10 ,10 ,10 ,10 ,10}), 1);
    }
}