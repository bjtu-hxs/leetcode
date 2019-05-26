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
        if (root == null) {
            return 0;
        }
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        return lDepth > rDepth ? lDepth + 1 : rDepth + 1;
    }
}
