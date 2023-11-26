package dsa.solutions.intuit;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {

    int id;
    ArrayList<TreeNode> children = new ArrayList<>();

    TreeNode(int id) {
        this.id = id;
    }
};
public class SubtreeCount {
    private static void getSubtree(TreeNode root, int[] count) {
        // Initial count of sub nodes is 1
        count[root.id - 1] = 1;

        for (int i = 0; i < root.children.size(); i++) {
            TreeNode child = root.children.get(i);

            // Get the count of the child node
            getSubtree(child, count);

            // Add the count of the child node in current node
            count[root.id - 1] += count[child.id - 1];
        }

    }

    public static int[] subtreeCount(int[] arr) {

        // Initialize an empty stack
        Stack<TreeNode> st = new Stack<>();

        // Set the root node
        TreeNode root = new TreeNode(1);

        st.push(root);
        int currIndex = 1;

        while (st.size() > 0) {

            // If an already visited node is found delete it from the stack
            if (arr[currIndex] == st.peek().id) {
                st.pop();
            } else {

                // If a node if found for the first time create a node
                TreeNode newNode = new TreeNode(arr[currIndex]);
                st.peek().children.add(newNode);

                // Add the node in the stack
                st.push(newNode);
            }

            // Increase the current index
            currIndex += 1;
        }

        // Empty array of half the lenght
        int[] count = new int[arr.length / 2];

        getSubtree(root, count);

        // Finally return the array
        return count;
    }

}
