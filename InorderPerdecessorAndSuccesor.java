
// BST Node
import java.util.*;
import java.util.List;
import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
class Solution {
       Node inOrderSuccesor(Node root,int key){
        Node suc = null;
        while (root!=null) {
            if (root.data<key) {
                root = root.right;
            }
            else{
                suc=root;
                root = root.left;
            }
        }
        return suc;
       }
       Node inOrderPredesecur(Node root,int key){
        Node pre = null;
        while (root!=null) {
            if (root.data<key) {
                pre = root;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return pre;
       }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        List<Node> list = new ArrayList<>();
        Node pre = inOrderPredesecur(root, key);
        Node suc = inOrderSuccesor(root, key);
        list.add(pre);
        list.add(suc);
        return (ArrayList<Node>) list;
    }
}
public class InorderPerdecessorAndSuccesor {

}
