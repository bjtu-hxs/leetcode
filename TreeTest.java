import java.util.*;


public class TreeTest {
    public static void main(String[] args) {

    }

    private static void createTree(Scanner scanner, TreeNode root) {
        String val = scanner.next();
        switch (val) {
            case "*":
                return;
            case "#":   // #置空
                root = null;
                break;
            default:
                root = new TreeNode();
                root.val = Integer.valueOf(val);
                createTree(scanner, root.left);  // 递归生成左右子树

                createTree(scanner, root.right);
                break;
        }
    }


    public void preOrder(TreeNode t) {
        Stack<TreeNode> nodeStack = new Stack<>();//初始化栈
        TreeNode root = t;//保存当前节点
        //当前节点与栈不同时为空，则进行循环
        while (root != null || !nodeStack.isEmpty()) {
            //找到最左端节点
            while (root != null) {
                System.out.println(root.val);//输出当前节点
                nodeStack.push(root);//当前节点入栈
                root = root.left;//访问左子树
            }
            //左子树遍历后，出栈访问右子树
            if (!nodeStack.isEmpty()) {
                root = nodeStack.pop();
                root = root.right;
            }
        }
    }

    public void medOrder(TreeNode t) {
        Stack<TreeNode> nodeStack = new Stack<>();//初始化栈
        TreeNode root = t;//保存当前节点
        //同样，当前节点与栈不同时为空，则循环
        while (root != null || !nodeStack.isEmpty()) {
            //寻找最左节点
            while (root != null) {
                nodeStack.push(root);//当前节点入栈
                root = root.left;
            }
            if (!nodeStack.isEmpty()) {
                root = nodeStack.pop();
                System.out.println(root.val);//输出当前节点
                root = root.right;//进入右子树
            }
        }
    }

    // 非递归后序遍历
    public static void postOrder(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = root;//记录当前节点
        TreeNode lastVisit = root;//记录上一个访问的节点
        while (node != null || !treeNodeStack.isEmpty()) {
            //找到最左边的节点
            while (node != null) {
                treeNodeStack.push(node);
                node = node.left;
            }
            //查看当前栈顶元素
            node = treeNodeStack.peek();
            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if (node.right == null || node.right == lastVisit) {
                System.out.print(node.val);
                treeNodeStack.pop();
                lastVisit = node;
                node = null;
            } else {
                //否则，继续遍历右子树
                node = node.right;
            }
        }
    }

    public void levelOrder(TreeNode root) {
        if (root == null) {  // 边界判断
            return;
        }
        Deque<TreeNode> que = new LinkedList<>();  // 队列
        TreeNode node;  // 将要访问的节点变量
        que.addLast(root);  // 先保存根节点

        while (!que.isEmpty()) {
            node = que.removeFirst();
            if (node.left != null) {  // 左子节点不为空则入列
                que.addLast(node.left);
            }
            if (node.right != null) {  // 右子节点不为空则入列
                que.addLast(node.right);
            }
            System.out.println(node.val);  // 访问当前节点
        }
    }

//    递归遍历
//    public void preOrder(TreeNode t) {
//        if (t != null){
//            System.out.println();
//            preOrder(t.left);
//            preOrder(t.right);
//        }
//    }
//
//    public void medOrder(TreeNode t) {
//        if (t != null){
//            medOrder(t.left);
//            System.out.println();
//            medOrder(t.right);
//        }
//    }
//
//    public void postOrder(TreeNode t) {
//        if (t != null){
//            postOrder(t.left);
//            postOrder(t.right);
//            System.out.println();
//        }
//    }
}

