import java.util.Stack;

import javax.swing.tree.TreeNode;
//  Definition for a binary tree node.
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
 public class SameTree {
    public Stack<Integer> inorder(TreeNode p) {
        Stack<Integer> st = new Stack<>();
        Stack<TreeNode> temp = new Stack<>();
        TreeNode node1 = p;
        while (node1 != null || !temp.isEmpty()) {
            while (node1 != null) {
                temp.push(node1);
                node1 = node1.left;
            }
            node1 = temp.pop();
            st.push(node1.val);
            node1 = node1.right;
        }
        return st;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<Integer> st1 = inorder(p);
        Stack<Integer> st2 = inorder(q);
        if (st1.size() != st2.size()) {
            return false;
        }
        while (!st1.isEmpty() && !st2.isEmpty()) {
            if (!st1.pop().equals(st2.pop())) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        
    }
}
