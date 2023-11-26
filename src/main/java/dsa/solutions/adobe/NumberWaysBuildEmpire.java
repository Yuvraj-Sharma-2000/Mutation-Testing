package dsa.solutions.adobe;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberWaysBuildEmpire {
    public static int mod = 1000000007;

    // Binary exponentiation to find a^p in log(p)
    public static long binpow(int i, int j, long[] fact) {
        long mod = 1000000007;
        long a = fact[i];
        long b = ((fact[i - j] % mod) * (fact[j] % mod)) % mod;
        BigInteger B = BigInteger.valueOf(b);
        long binverse = B.modInverse(BigInteger.valueOf(mod)).longValue();
        return ((a) * (binverse % mod)) % mod;
    }

    // DFS-function
    public static long[] dfs(int root, List < Integer > graph[], long[] dp) {
        long res[] = new long[] { 1, 0 };

        // 'cnt' stores the count of nodes in subtree rooted at 'cur'
        int cnt = 0;
        List < long[] > list = new ArrayList < > ();

        // Traversing each child node
        if (graph[root] != null) {

            // Current child node
            for (int next: graph[root]) {

                // DFS call
                long v[] = dfs(next, graph, dp);

                // Increment the value of 'cnt' to include the nodes in subtree of current child
                cnt = cnt + (int) v[0];
                list.add(v);
            }
        }

        res[0] += cnt;
        long com = 1;
        for (long p[]: list) {
            long choose = binpow(cnt, (int)(p[0]), dp);
            cnt -= p[0];
            com = com * choose;
            com %= mod;
            com = com * p[1];
            com %= mod;
        }

        res[1] = com;
        return res;
    }

    public static int waysToBuildEmpire(int[] prevKingdom) {
        int n = prevKingdom.length;
        // Adjacency list to store the tree
        List< Integer > graph[] = new ArrayList[n + 1];
        int cnt[] = new int[n + 1];;
        long fact[] = new long[prevKingdom.length + 1];;

        Arrays.setAll(graph, e -> new ArrayList< >());
        fact[0] = fact[1] = 1;

        // Precalculate the factorials from 0 to n to avoid recalculations
        for (int i = 2; i < fact.length; i++) {
            fact[i] = fact[i - 1] * i;
            fact[i] %= mod;
        }

        // Filling up the adjacency list
        for (int i = 1; i < prevKingdom.length; i++) {
            int pre = prevKingdom[i];
            graph[pre].add(i);
        }

        // Inital dfs call from root node
        long res[] = dfs(0, graph, fact);

        // Return the final answer
        return (int)(res[1] % mod);
    }
}
