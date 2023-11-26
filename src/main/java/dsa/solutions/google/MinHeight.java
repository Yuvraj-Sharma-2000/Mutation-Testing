package dsa.solutions.google;


import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class MinHeight {
    // Function to find the height of a rooted tree using BFS.
    public static int findHeight(int root, ArrayList<Integer>[] adj)
    {
        int[] dis = new int[adj.length];
        for(int i=0; i < adj.length; i++){
            dis[i] = Integer.MAX_VALUE;
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(root);
        dis[root] = 0;

        int height = 0;

        while (!q.isEmpty())
        {
            int ele = q.poll();

            for (int i: adj[ele])
            {
                if (dis[i] == Integer.MAX_VALUE)
                {
                    dis[i] = dis[ele] + 1;
                    height = dis[i];
                    q.add(i);
                }
            }
        }

        return height;
    }

    public static int[] minHeightRoots(int[][] edges){
        int n = edges.length;
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for(int i = 0; i <= n; i++){
            adj[i] = new ArrayList<Integer>();
        }

        // Building the adjacency list.
        for (int i = 0; i < (n - 1); i++)
        {
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }

        ArrayList<Integer> rootsList = new ArrayList<>();
        int minHeight = Integer.MAX_VALUE;

        // Iterating through all the nodes.
        for (int i = 1; i <= n; i++)
        {
            // Finding height of the tree rooted at Node i.
            int height = findHeight(i, adj);

            // Checking if the current height is the minimum height.
            if (height < minHeight)
            {
                minHeight = height;
                rootsList.clear();
                rootsList.add(i);
            }
            else if (minHeight == height)
            {
                rootsList.add(i);
            }
        }

        // Converting ArrayList to Array.
        int[] res = new int[rootsList.size()];
        for(int i = 0; i < rootsList.size(); i++){
            res[i] = (int)rootsList.get(i);
        }

        return res;
    }
}
