import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BottomViewOFBT {
    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        
        while (!q.isEmpty()) {
            Pair temp = q.remove();
            Node node = temp.node;
            int hd = temp.hd;
            
            // For bottom view, we always update the map with the latest node at each horizontal distance
            mpp.put(hd, node.data);
            
            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }
            
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }
        
        // Add all values from the map to the result list
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            ans.add(entry.getValue());
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        // Example usage:
        // Creating a sample tree:
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        
        ArrayList<Integer> result = bottomView(root);
        System.out.println("Bottom view of the binary tree: " + result);
    }
}
