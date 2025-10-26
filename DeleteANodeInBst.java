/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root;
        TreeNode prev = cur;
        while (cur!=null&&prev!=null) {
            if(cur.val==key) {
                prev.left = cur.left;
                cur.left.right = cur.right;
            }
            TreeNode temp = cur;
           if(key>cur.val){

            cur = cur.right;

           }else{
            cur = cur.left;
           }
           prev = temp;
        }
        return root;
    }
}
public class DeleteANodeInBst {
    
}
