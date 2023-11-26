package dsa.solutions.microsoft;

import com.jayway.jsonpath.internal.function.numeric.Min;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumStepsTest {

    @Test
    void minimumSteps() {
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{5,2,3}),3);
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{1,2,1,1}),1);
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{2,2,2}),0);
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{1,1,2,2}),2);
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{15,12,3,4,13,14,9,15,15,0,15,4,14,7,2,8}),97);
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{2}),0);
        Assertions.assertEquals(MinimumSteps.minimumSteps(new int[]{5,1,3,4,1,8,2,5,2,1,4,1}),23);
    }
}