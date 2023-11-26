package dsa.solutions.adobe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GoForGold {
    public static int goForGold(int[][] arr, int x, int y) {
        int n = arr.length;
        int m = arr[0].length;
        // Map to store the houses containing gold
        HashMap<ArrayList<Integer>, Integer> mp = new HashMap<>();

        // Variable to number the houses containing gold
        int num = 0;

        // Traverse the city to find houses containing gold
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);

                    mp.put(temp, num);
                    num++;

                }
            }
        }

        // Variable to set the maximum value of bit-mask
        int target = (int)Math.pow(2, num);

        // Bit-mask, where mask[i][j][k] represents minimum steps to reach (i,j)
        int[][][] mask = new int[n][m][target];

        // Initialize minimum steps to -1, to mark a position as unvisited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for(int k = 0; k < target; k++){
                    mask[i][j][k] = -1;
                }
            }
        }

        // Variable to keep the track of steps in bfs
        int steps = 0;

        // Array to simulate the moves
        int[][] moves = { {0, 1}, {1, 0}, {-1, 0}, {0, -1} };

        // BFS queue
        Queue<int[]> q = new LinkedList<>();

        // Variable to store the calculated-mask
        int ctr = 0;

        // Check if the starting position contains gold or not
        if (arr[0][0] == 1) {

            // Store the gold-house number in 'ctr'
            ArrayList<Integer> temp = new ArrayList<Integer>(){
                {
                    add(0);
                    add(0);
                }
            };

            ctr += mp.get(temp);

            // Convert 'ctr' into 2^ctr to create a mask
            ctr = (int)Math.pow(2, ctr);
        }

        // Push the starting position after masking it
        int[] temp = {0, 0, ctr};
        q.add(temp);

        // Mark the starting position as visited, to avoid revisiting it
        mask[0][0][ctr] = 0;

        // BFS algorithm
        while (q.size() > 0){
            int sz = q.size();

            while (sz > 0) {
                sz--;

                int[] getTop = q.peek();
                q.remove();

                int i = getTop[0];
                int j = getTop[1];
                int k = getTop[2];

                // If we have reached (X,Y) and collected all the gold.
                // Note that 'k' storing the bitmask will be (11....111) in binary representation
                if (i == x && y == j && k == target - 1) {
                    return steps;
                }

                // Move to the the next adjacent house
                for (int u = 0; u < 4; u++){

                    // 'i + u[0]' & 'j + u[1]' stores the new x-coordinate & y-coordinate
                    int newX = i + moves[u][0];
                    int newY = j + moves[u][1];

                    // Check that you stay within the city bounds and don't move to a house containing guards
                    if (newX < n && newX >= 0 && newY < m && newY >= 0 && arr[newX][newY] != 2){

                        // If the new position is a gold-house
                        if (arr[newX][newY] == 1){

                            // Store the gold-house number in 'ctr'
                            ArrayList<Integer> getArray = new ArrayList<Integer>(){
                                {
                                    add(newX);
                                    add(newY);
                                }
                            };
                            if(mp.get(getArray) != null){
                                ctr = mp.get(getArray);
                            }
                            else{
                                ctr = 0;
                            }

                            // Check if the ctr'th bit of the current mask is OFF
                            if ((k & (1 << ctr)) == 0) {

                                // Convert 'ctr' into 2^ctr to create a mask
                                ctr = k + (int)Math.pow(2, ctr);

                                // Check if the new mask is already visited
                                if (mask[newX][newY][ctr] != -1) {
                                    continue;
                                }

                                // Push the new masked position into bfs-queue
                                int []pushInQueue = {newX, newY, ctr};
                                q.add(pushInQueue);

                                // Marked the new masked position as visited
                                mask[newX][newY][ctr] = 1;
                            }

                            // Incase the ctr'th bit of the current mask is ON (already visited this gold house previously)
                            else {

                                // In the previous visit to this house, we might have visited less gold-houses, check that
                                // Incase no extra gold houses were visited then mask[newX][newY][k] would be != -1 (ie: visited)
                                if (mask[newX][newY][k] != -1) {
                                    continue;
                                }

                                // Incase extra gold-houses were found after last visit, then the mask 'k' would be different now
                                // Push the new masked position into bfs-queue
                                int []pushInQueue = {newX, newY, k};
                                q.add(pushInQueue);

                                // Marked the new masked position as visited
                                mask[newX][newY][k] = 1;
                            }

                        }

                        // If the new position is not a gold-house
                        else {

                            // Check if the masked position is already visited or not
                            if (mask[newX][newY][k] != -1) {
                                continue;
                            }

                            // Incase extra gold-houses were found after last visit, then the mask 'k' would be different now
                            // Push the new masked position into bfs-queue
                            int []pushInQueue = {newX, newY, k};
                            q.add(pushInQueue);

                            // Marked the new masked position as visited
                            mask[newX][newY][k] = 1;
                        }
                    }
                }
            }

            // Inrement the value of 'steps'
            steps++;
        }

        // Unable to reach the final position after collecting all the gold
        return -1;
    }
}
