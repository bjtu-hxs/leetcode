/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Q101_SymmetricTree {
    // Method_01  10ms  92.26%
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricSubTree(root.left, root.right);
    }

    private boolean isSymmetricSubTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        return isSymmetricSubTree(left.left, right.right)
                && isSymmetricSubTree(left.right, right.left);
    }
}