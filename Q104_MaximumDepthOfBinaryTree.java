/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class Q104_MaximumDepthOfBinaryTree {
    // Method_01  0ms  100%
    public int maxDepth(TreeNode root) {
        return numOfChildren(root);
    }

    private static int numOfChildren(TreeNode parent) {
        if (parent == null) {
            return 0;
        }
        int lDepth = numOfChildren(parent.left);
        int rDepth = numOfChildren(parent.right);
        return lDepth > rDepth ? lDepth + 1 : rDepth + 1;
    }
}
