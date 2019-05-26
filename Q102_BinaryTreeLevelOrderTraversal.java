import java.util.*;

public class Q102_BinaryTreeLevelOrderTraversal {
    // Method_01  2ms  84.73%
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {  //边界判断
            return result;
        }

        Deque<TreeNode> cur = new LinkedList<>();  //队列保存一层
        Deque<TreeNode> sub = new LinkedList<>();  //队列保存下一层
        Deque<TreeNode> exc;

        TreeNode node;
        cur.addLast(root);  //先保存根节点

        while(!cur.isEmpty()) {
            List<Integer> layout = new ArrayList<>();  //保存一层的节点
            while(!cur.isEmpty()) {
                node = cur.removeFirst();   //弹出前面第一个节点
                layout.add(node.val);       //添加到输出集合中

                if (node.left != null) {    //把弹出的节点的左节点加入另一个队列
                    sub.addLast(node.left);
                }

                if (node.right != null) {   //把弹出的节点的右节点加入另一个队列
                    sub.addLast(node.right);
                }
            }

            exc = cur;       //交换
            cur = sub;
            sub = exc;

            result.add(layout);  //添加到结果集里
        }
        return result;
    }

}
