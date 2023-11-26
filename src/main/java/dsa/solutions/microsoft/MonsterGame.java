package dsa.solutions.microsoft;

import java.util.LinkedList;
import java.util.Queue;
public class MonsterGame {
    public static int countMonsters(int l, int m) {
        // Create queue.
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(-1);

        // To store monsters.
        int count = 1;

        // To store number of monsters for each 'M'.
        int[] dp = new int[m];

        // Pre-computation.
        for (int i = 0; i < m; ++i) {
            dp[i] += ((i * i) + 1) % m;
        }

        // Traverse all levels.
        while (l > 1) {
            while (q.peek() != -1) {
                int x = q.poll();

                // Update count.
                count += dp[x];
                for (int i = 0; i < dp[x]; ++i) {
                    q.add(i);
                }
            }
            q.poll();
            q.add(-1);
            --l;
        }
        return (count % m);
    }
}
