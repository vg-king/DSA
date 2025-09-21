import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

// Node class for binary tree
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Pair class to store node and its horizontal distance
class Pair {
    Node node;
    int hd;
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopViewOFBT {
    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> mpp = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while (!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            if(mpp.get(hd)==null) mpp.put(hd, temp.data);
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }
            if (temp.right!=null) {
                q.add(new Pair(temp.right,hd+1));
            }
       }
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Example usage:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        ArrayList<Integer> result = topView(root);
        System.out.println("Top view: " + result);
    }
}
