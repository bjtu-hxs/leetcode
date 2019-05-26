import java.util.*;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
public class Q133_CloneGraph {
//    // Method 1 3ms 96.38%
//    public Node cloneGraph(Node node) {
//        if (node == null) {
//            return null;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(node);
//        Node clone = new Node(node.val, new ArrayList<>());
//        Map<Node, Node> map = new HashMap<>();
//        map.put(node, clone);
//        while(!queue.isEmpty()) {
//            Node cur = queue.poll();
//            if (cur.neighbors != null) {
//                for (Node neighbor : cur.neighbors) {
//                    if (!map.containsKey(neighbor)) {
//                        queue.add(neighbor);
//                        map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
//                    }
//                    map.get(cur).neighbors.add(map.get(neighbor));
//                }
//            }
//        }
//        return clone;
//    }

    // Method 2 3ms 96.38%
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node clone = new Node(node.val, new ArrayList<>());
        map.put(node, clone);
        for (Node neighbor : node.neighbors) {
            if (!map.containsKey(neighbor)) {
                Node cloneNeighbor = cloneGraph(neighbor);
                clone.neighbors.add(cloneNeighbor);
            } else {
                clone.neighbors.add(map.get(neighbor));
            }
        }
        return clone;
    }
}