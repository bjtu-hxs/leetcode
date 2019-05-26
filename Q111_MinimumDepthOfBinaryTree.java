public class Q111_MinimumDepthOfBinaryTree {
    // Method 1 1ms 90.25%
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        if(root.left == null || root.right == null) {
            return Math.max(minDepth(root.left), minDepth(root.right))+1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
