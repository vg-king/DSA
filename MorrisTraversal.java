import java.util.*;
import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
class Solution {

    public List<Integer> getInorder(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        TreeNode cur = root;

        while (cur != null) {
            if (cur.left == null) {
                // If no left child, visit this node and go right
                inorder.add(cur.val);
                cur = cur.right;
            } else {
                // Find the inorder predecessor of cur
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    // Make a temporary link to cur
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    // Break the link, visit this node, and go right
                    prev.right = null;
                    inorder.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return inorder;
    }
}
public class MorrisTraversal {
    
}
