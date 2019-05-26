import sun.reflect.generics.tree.Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Q108_SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) { //边界判断
            return null;
        }
        return subArrayToBST(0, nums.length - 1, nums);  // 递归调用
    }

    private TreeNode subArrayToBST(int start, int end, int[] nums) {
        int index = (start + end) / 2;  //取中心节点作为父节点
        TreeNode root = new TreeNode(nums[index]);
        if (start == end){  // 递归结束条件
            return root;
        }
        if (start != index) {  // start == index时start > index - 1
            root.left = subArrayToBST(start, index - 1, nums);
        }
        if (index != end) {  // 同上
            root.right = subArrayToBST(index + 1, end, nums);
        }
        return root;
    }
}