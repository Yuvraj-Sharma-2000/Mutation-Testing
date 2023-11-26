package dsa.solutions.goldmansachs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeAndValidityTest {

    @Test
    void isValid() {
        Assertions.assertEquals(PrimeAndValidity.isValid(10,2),1);
        Assertions.assertEquals(PrimeAndValidity.isValid(2,2),0);
        Assertions.assertEquals(PrimeAndValidity.isValid(10,3),1);
        Assertions.assertEquals(PrimeAndValidity.isValid(7,3),1);
        Assertions.assertEquals(PrimeAndValidity.isValid(3,5),0);
        Assertions.assertEquals(PrimeAndValidity.isValid(8,4),1);
        Assertions.assertEquals(PrimeAndValidity.isValid(5,8),0);
        Assertions.assertEquals(PrimeAndValidity.isValid(10,6),0);
        Assertions.assertEquals(PrimeAndValidity.isValid(31,6),1);
    }
}