package dsa.solutions.google;

public class ClosestShop {
    public static int[] closestShop(int h, int[] house, int s, int[] shop)
    {
        // To store the location.
        int[] res = new int[h];
        for(int i=0;i < h; i++){
            res[i] = Integer.MAX_VALUE;
        }

        // Iterate over houses.
        for (int i = 0; i < h; ++i) {

            // Distance between house ans shop.
            int dist = Integer.MAX_VALUE;

            // Iterate over shops.
            for (int j = 0; j < s; ++j) {

                // Check conditions.
                if (Math.abs(house[i] - shop[j]) < dist) {
                    dist = Math.abs(house[i] - shop[j]);
                    res[i] = shop[j];
                }
                else if (Math.abs(house[i] - shop[j]) == dist) {
                    dist = Math.abs(house[i] - shop[j]);
                    res[i] = Math.min(res[i], shop[j]);
                }
            }
        }

        return res;
    }
}

