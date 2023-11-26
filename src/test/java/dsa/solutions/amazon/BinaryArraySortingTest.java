package dsa.solutions.amazon;

import edu.emory.mathcs.backport.java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryArraySortingTest {
    List<Integer> x = null;
    List<Integer> y = null;
    @Test
    void sortBinaryArray() {
        x = List.of(0,1,0);
        y = List.of(0,0,1);
        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));

        x = List.of(0,0,0,1);
        y = List.of(0,0,0,1);
        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));

        x = List.of();
        y = List.of();
        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));

        x = List.of(0);
        y = List.of(0);

        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));

        x = List.of(1, 1 ,0 ,1, 0 ,0, 0 ,1);
        y = List.of(0,0,0,0,1,1,1,1);
        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));

        x = List.of(0, 0, 0, 1 ,1 ,1, 1);
        y = List.of(0, 0, 0, 1 ,1 ,1, 1);
        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));

        x = List.of(0, 0, 1, 1 ,0 ,1, 1, 0 ,1, 1);
        y = List.of(0,0,0,0,1,1,1,1,1,1);
        Assertions.assertEquals(new BinaryArraySorting().sortBinaryArray(new ArrayList<>(x)),new ArrayList<>(y));
    }
}