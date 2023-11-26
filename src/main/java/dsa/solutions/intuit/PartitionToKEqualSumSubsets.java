package dsa.solutions.intuit;

public class PartitionToKEqualSumSubsets {
    private static boolean canPartitionKSubsetsHelper(int[] nums, int K, boolean[] vis, int targetSubsetSum,
                                                      int curSubsetSum, int checkIdx) {

        // If all the K subsets have been formed successfully.
        if (K == 0) {
            return true;
        }

        if (curSubsetSum == targetSubsetSum) {
            return canPartitionKSubsetsHelper(nums, K - 1, vis, targetSubsetSum, 0, 0);
        }

        for (int i = checkIdx; i < nums.length; i++) {
            if (vis[i] == false && curSubsetSum + nums[i] <= targetSubsetSum) {
                vis[i] = true;
                if (canPartitionKSubsetsHelper(nums, K, vis, targetSubsetSum, curSubsetSum + nums[i], i + 1)) {
                    return true;
                }

                vis[i] = false;
            }

        }

        return false;
    }

    public static boolean canPartitionKSubsets(int[] nums, int n, int K) {
        int sum = 0;
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxNum = Math.max(maxNum, nums[i]);
        }

        // If total sum is not divisible by K or maximum number > eachSum.
        if (sum % K != 0 || maxNum > sum / K) {
            return false;
        }

        boolean[] vis = new boolean[n];
        return canPartitionKSubsetsHelper(nums, K, vis, sum / K, 0, 0);
    }
}
