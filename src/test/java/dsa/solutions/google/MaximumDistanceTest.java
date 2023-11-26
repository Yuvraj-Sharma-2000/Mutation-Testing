package dsa.solutions.google;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDistanceTest {
    String[] x = null;

    @Test
    void maximumDistanceTest(){
        x = new String[]{"1011100" ,"1011011" ,"1001111" ,"0111111"};
        Assertions.assertEquals(MaximumDistance.maximumDistance(x),14);

        x = new String[]{"1100" ,"1110" ,"0111" ,"00"};
        Assertions.assertEquals(MaximumDistance.maximumDistance(x),8);

        x = new String[]{"01000" ,"01011" ,"010" ,"011"};
        Assertions.assertEquals(MaximumDistance.maximumDistance(x),4);

        x = new String[]{"10110100000000101" ,"0111100111100010000" ,"101100000010111" ,"1101010001010" ,"10010011011" ,"10110101100" ,"01101110" ,"000100000010011110" ,"0001011100011100" ,"100111100" ,"0110101111011" ,"0100010" ,"001100111110"};
        Assertions.assertEquals(MaximumDistance.maximumDistance(x),36);

        x = new String[]{};
        Assertions.assertEquals(MaximumDistance.maximumDistance(x),0);

        x = new String[]{"00110000" ,"1011100" ,"1101110001" ,"111000" ,"101101111" ,"111110110111" ,"0110001" ,"101110000000100010" ,"00010010000" ,"010101111010" ,"000001010" ,"100010110100110"};
        Assertions.assertEquals(MaximumDistance.maximumDistance(x),30);


    }
}
