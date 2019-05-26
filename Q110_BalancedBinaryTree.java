public class Q110_BalancedBinaryTree {
//    // Method 1 4ms 22.22%
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        if (Math.abs(countDeep(root.left) - countDeep(root.right)) > 1) {
//            return false;
//        }
//        else {
//            return isBalanced(root.left) && isBalanced(root.right);
//        }
//    }
//
//    public int countDeep(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        return 1+Math.max(countDeep(root.left), countDeep(root.right));
//    }

    //Method 2 2ms 92.98%
    boolean res = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        countDeep(root);
        return res;
    }

    public int countDeep(TreeNode root) {
        if (!res) {
            return -1;
        }
        if (root == null) {
            return 0;
        }
        int left = countDeep(root.left);
        int right = countDeep(root.right);
        if (Math.abs(left - right) > 1) {
            res = false;
        }
        return 1+Math.max(left, right);
    }
}
