package dsa.solutions.walmart;

public class MinCost {

        private static int minCostToBuyOrangesHelper(int idx, int requiredWeight, int cost[], int n)
        {

            //  Base Case
            if (requiredWeight == 0)
            {
                return 0;
            }

            //  If we reached the end of cost[] but some weight is still left to cover
            if (idx == n)
            {
                return Integer.MAX_VALUE;
            }

            //  If weight of 'idx' packet is greater than requried weight
            if (idx + 1 > requiredWeight)
            {
                return Integer.MAX_VALUE;
            }

            //  Initializing
            int aheadCost, finalCost = Integer.MAX_VALUE;

            if (cost[idx] == -1)
            {
                //  If packet of this weight is not available
                finalCost = minCostToBuyOrangesHelper(idx + 1, requiredWeight, cost, n);
            }
            else
            {
                // Option of taking this packet
                aheadCost = minCostToBuyOrangesHelper(idx, requiredWeight - (idx + 1), cost, n);

                if (aheadCost != Integer.MAX_VALUE)
                {
                    finalCost = cost[idx] + aheadCost;
                }

                //  Option of skiping this packet
                aheadCost = minCostToBuyOrangesHelper(idx + 1, requiredWeight, cost, n);
                finalCost = Math.min(finalCost, aheadCost);
            }

            return finalCost;
        }

        public static int minCostToBuyOranges(int cost[], int w)
        {
            int n = cost.length;

            int minCost = minCostToBuyOrangesHelper(0, w, cost, n);

            //  If it's not possible to buy exactly W kg oranges
            if (minCost == Integer.MAX_VALUE)
            {
                return -1;
            }

            return minCost;
        }


}
