import java.util.ArrayList;
import java.util.List;
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}

class Solution {
     public  void inOrder(Node node,List<Integer> list){
        if(node==null) return ;
        inOrder(node.left,list);
        list.add(node.data);
        inOrder(node.right,list);
    }
    public  int findMax(Node root) {
       root = root.left;
       List<Integer> list = new ArrayList<>();
       inOrder(root, list);
       int max = list.get(0);
       for (int i = 0; i < list.size(); i++) {
        if (max>list.get(i)) {
            max = list.get(i);
        }
       }
       return max;
    }

    public  int findMin(Node root) {
        
       root = root.right;
       List<Integer> list = new ArrayList<>();
       inOrder(root, list);
       int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
        if (min<list.get(i)) {
            min = list.get(i);
        }
       }
       return min;

    }
}
public class MinMaxInBST {

    
}