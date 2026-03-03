/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
   

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        int big = Math.max(p.val, q.val);
        int small = Math.min(p.val, q.val);
        if (root.val >= small && root.val <= big) {
            return root;
        }
        if (root.val >= big) {
            return lowestCommonAncestor(root.left, p, q);

        }
       else if (root.val <= small) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}