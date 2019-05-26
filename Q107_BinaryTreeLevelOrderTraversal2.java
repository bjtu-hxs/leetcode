import java.util.List;

public class Q107_BinaryTreeLevelOrderTraversal2 {
    // Method 1 2ms 89.10%
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new Q102_BinaryTreeLevelOrderTraversal().levelOrder(root);

        for (int i = 0; i < result.size() / 2; i++) {
            List<Integer> excArray = result.get(i);
            result.set(i, result.get(result.size()-1-i));
            result.set(result.size()-1-i, excArray);
        }

        return result;
    }
}
