
//  * Definition for a binary tree node.
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
   public void getInorder(TreeNode root){
    TreeNode cur = root;
    while (cur!=null) {
        if (cur.left==null) {
            cur = cur.right;

        }else{
            TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                } else {
                     prev.right = null;
                     TreeNode temp = cur.right;
                     cur.right = cur.left;
                     cur.left = null;
                     TreeNode p = cur.right;
                     while (p!=null) {
                        p=p.right;
                     }
                     p.right = temp;
                     cur = cur.right;
                }

        }
    }
   }
    public void flatten(TreeNode root) {
        getInorder(root);
    }
}
public class FlattenBinaryTreetoLinkedList {
    
}
