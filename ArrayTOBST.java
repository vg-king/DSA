import java.util.Stack;

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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        st.push(root);
        for (int i = 1; i < preorder.length; i++) {
            if (st.peek().val < preorder[i]) {
                cur.left = new TreeNode(preorder[i]);
                st.push(cur);
                cur = cur.left;
            } 
            else {
                while (!st.isEmpty() && st.peek().val < preorder[i]) {
                    cur = st.pop();
                }

                cur.right = new TreeNode(preorder[i]);
            }
        }
        return root;
    }
}

public class ArrayTOBST {

}
