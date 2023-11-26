package dsa.solutions.walmart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyStringsTest {
    String s1 = null;
    String s2 = null;

    String expected  = null;

    @Test
    void multiplyStrings(){

        s1 = "17281";
        s2 = "91276";
        expected = "1577340556";
        Assertions.assertEquals(expected ,MultiplyStrings.multiplyStrings(s1,s2));

        s1 = "5";
        s2 = "10";
        expected = "50";
        Assertions.assertEquals(expected ,MultiplyStrings.multiplyStrings(s1,s2));

        s1 = "0";
        s2 = "0";
        expected = "0";
        Assertions.assertEquals(expected ,MultiplyStrings.multiplyStrings(s1,s2));


        s1 = "21";
        s2 = "100";
        expected = "2100";
        Assertions.assertEquals(expected ,MultiplyStrings.multiplyStrings(s1,s2));

        s1 = "10000000000";
        s2 = "3";
        expected = "30000000000";
        Assertions.assertEquals(expected ,MultiplyStrings.multiplyStrings(s1,s2));


        s1 = "1";
        s2 = "1";
        String expected = "1";
        Assertions.assertEquals(expected ,MultiplyStrings.multiplyStrings(s1,s2));


    }
}
