import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//  * Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
 class Codec {
    public List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> subList = new LinkedList<>();
        if (root==null) {
            return subList;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                if(queue.peek()==null) subList.add(null);
                if (queue.peek().left!=null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right!=null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            


        }
        return subList;
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    List<Integer> list = levelOrder(root);
    return list.toString();
        }
    }
    public TreeNode makeTree(char arr[],int i){
        TreeNode root=null;
        if(i<arr.length){
            root = new TreeNode(arr[i]);
           
            root.left = makeTree(arr, 2*i+1);
            root.left = makeTree(arr, 2*i+2);
        }
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      char arr[]=  data.toCharArray();
      return makeTree(arr, 0);
    }


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
public class SerializeandDeserializeBinaryTree {
    
}
