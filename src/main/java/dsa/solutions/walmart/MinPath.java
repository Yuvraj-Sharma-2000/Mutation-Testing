package dsa.solutions.walmart;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class MinPath
{
    public static int minPath(int N, int[][] roads)
    {
        int n = roads.length;

        // Convert given connections into graph representation.
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(N);
        for (int i = 0; i < N; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i < n; i++)
        {
            graph.get(roads[i][0]).add(roads[i][1]);
            graph.get(roads[i][1]).add(roads[i][0]);
        }


        int infinite = 100000000;

        // To store length of the shortest cycle.
        int ans = infinite;

        // Making each vertex as root node.
        for(int i = 0; i < N; i++) {

            int source = i;

            // To store distance of vertices from root.
            ArrayList<Integer> dist = new ArrayList<Integer>(N);

            // To keep track of imaginary parent.
            ArrayList<Integer> parent = new ArrayList<Integer>(N);

            for(int j=0; j < N; j++){
                dist.add(infinite);
                parent.add(-1);
            }

            // Create a queue with source node.
            Queue<Integer> q = new LinkedList<>();
            q.add(source);
            dist.set(source,0);


            // Run BFS until queue is not empty.
            while (q.size() > 0) {

                int curr = q.peek();
                q.poll();

                for (int k = 0; k < graph.get(curr).size(); k++)
                {

                    // If it is not yet visited.
                    int child = graph.get(curr).get(k);
                    if (dist.get(child) == infinite) {
                        parent.set(child, curr);
                        dist.set(child, 1 + dist.get(curr));
                        q.add(child);
                    }

                    // If it's already visited by other parent.
                    else if ((parent.get(curr) != child) && (parent.get(child) != curr))
                    {

                        // Update the answer for current loop size.
                        ans = Math.min(ans, dist.get(curr) + dist.get(child) + 1);
                    }
                }
            }

            // BFS ends here.
        }

        // If no loop found.
        if(ans == infinite)
            return -1;
        else
            return ans;
    }

}