/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Q098_ValidateBinarySearchTree {
//    // Method_01  0ms  100%
//    private long min = Long.MIN_VALUE;
//
//    public boolean isValidBST(TreeNode root) {
//        return medOrder(root);
//    }
//
//    private boolean medOrder(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        if (!medOrder(root.left)) {
//            return false;
//        }
//        if (root.val <= this.min) {
//            return false;
//        } else {
//            this.min = root.val;
//        }
//        return medOrder(root.right);
//    }

    // Method_02  0ms  100%
    public boolean isValidBST(TreeNode root) {
        return isValidSubBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidSubBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidSubBST(root.left, min, root.val)
                && isValidSubBST(root.right, root.val, max);
    }
}