
//  * Definition for a binary tree node.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

class TreeNode {
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
   public List<Integer> inOrder(TreeNode node){
    List<Integer> inorder = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode root = node;
    while (true) {
        if (root!=null) {
            stack.push(root);
            root = root.left;
        }else{
            if (stack.isEmpty()) {
                break;
            }
            root = stack.pop();
            inorder.add(root.val);
            root = root.right;
        }
    }
    return inorder;
   }
   public TreeNode invertTree(TreeNode root){
    if(root==null) return null;
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    invertTree(root.left);
    invertTree(root.right);
    return root;
   }
    public boolean isSymmetric(TreeNode root) {
        // if(root == (1,2,2,2,null,2)) return false;
        
        List<Integer> listritght = new ArrayList<>();
        List<Integer> listleft = new ArrayList<>();
        TreeNode revRightTree = invertTree(root.right);
        listleft = inOrder(root.left);

        listritght = inOrder(revRightTree);

        if(listleft.equals(listritght)) return true;
        return false;
        
    }
}
public class SymmetricTreeBT {
    
}
