import javax.swing.tree.TreeNode;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxPathSumBT {
    
//   Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
     public int inOrder(TreeNode node){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        Stack<TreeNode> st = new Stack<>();
        TreeNode root = node;
        while (true) {
            if (root!=null) {
                st.push(root);
                root=root.left;
            }else
            {
                if (st.isEmpty()) break;
                root = st.pop();
                sum+=root.val;
                list.add(sum);
                root = root.right;
            }
        }
        return Collections.max(list);
        
    }
    public int maxPathSum(TreeNode root) {
        return inOrder(root);
    }
}
    public static void main(String[] args) {
        
    }
}
