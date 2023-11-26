package dsa.solutions.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @Test
    void uniquePaths() {
        Assertions.assertEquals(new UniquePaths().uniquePaths(2,2),2);
        Assertions.assertEquals(new UniquePaths().uniquePaths(3,2),3);
        Assertions.assertEquals(new UniquePaths().uniquePaths(1,1),1);
        Assertions.assertEquals(new UniquePaths().uniquePaths(4,4),20);
        Assertions.assertEquals(new UniquePaths().uniquePaths(3,5),15);
        Assertions.assertEquals(new UniquePaths().uniquePaths(1,6),1);
        Assertions.assertEquals(new UniquePaths().uniquePaths(5,4),35);
        Assertions.assertEquals(new UniquePaths().uniquePaths(3,9),45);
        Assertions.assertEquals(new UniquePaths().uniquePaths(5,5),70);
        Assertions.assertEquals(new UniquePaths().uniquePaths(7,1),1);
    }
}