import java.util.ArrayList;
import java.util.List;
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Solution {
     public void postOrder(Node node,List<Integer> list){
        if(node==null) return ;
        postOrder(node.left,list);
        postOrder(node.right,list);
        list.add(node.data);
    }
    public boolean isSumProperty(Node root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
 int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        for ( int i = 0; i <arr.length;  i+=2) {
            int j = i+3;
           if( arr[j] != arr[i]+arr[i+1]){
            return false;
           }
           
        }
        return false;
    }
}
public class ChildreninaBinaryTree {
    
}
