package dsa.solutions.microsoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingDecreasingArrayTest {

    @Test
    void incDecArray() {
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(4,"PPN"),new ArrayList<>(List.of(1, 2, 4, 3)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(4,"PNN"),new ArrayList<>(List.of(1, 4, 3, 2)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(5,"PPPP"),new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(2,"NN"),new ArrayList<>(List.of(2,1)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(86,"PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPNPPPPPPPPPPPPPPPPPPPP"),new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 66, 65, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(20,"PPNNPNNNPPNPNPNPPNP"),new ArrayList<>(List.of(1, 2, 5, 4, 3, 9, 8, 7, 6, 10, 12, 11, 14, 13, 16, 15, 17, 19, 18, 20)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(7,"PPNNNP"),new ArrayList<>(List.of(1, 2, 6, 5, 4, 3, 7)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(84,"PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP"),new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84)));
        Assertions.assertEquals(IncreasingDecreasingArray.incDecArray(28,"NNPPNPPPNNPNPNNPPNPPPPNPPNN"),new ArrayList<>(List.of(3, 2, 1, 4, 6, 5, 7, 8, 11, 10, 9, 13, 12, 16, 15, 14, 17, 19, 18, 20, 21, 22, 24, 23, 25, 28, 27, 26)));
    }
}