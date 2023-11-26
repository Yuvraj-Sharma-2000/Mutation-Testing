package dsa.solutions.intuit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsTest {

    @Test
    void canPartitionKSubsets() {
        assertEquals(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{4,3,1,3,4,3,1,2},8,3),true );
        assertEquals(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{5,1,2,6,7,1,8},7,4),false );
        assertEquals(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{128, 84 ,150 ,842 ,242 ,96 ,142},7,2), true);
        assertEquals(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{76 ,78 ,39 ,231 ,38 ,231 ,231 ,78 ,34 ,119 ,23},11,6),false );
        assertEquals(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{99 ,257 ,233 ,47 ,91, 290 ,547 ,547 ,124 },9,5), false);
        assertEquals(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{12 ,60 ,26, 282, 12, 169, 82 ,282, 3 },9,4), false);

    }
}