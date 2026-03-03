import java.util.ArrayList;
import java.util.List;
//  * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode search(TreeNode root,int key){
        if (root==null) {
            return null;
        }
        if (root.val==key) {
            return root;
        }
        TreeNode left = search(root.left, key);
        if (left!=null) {
            return left;
        }
        return search(root.right, key);
    }
    boolean fun(TreeNode p,TreeNode q){
        if (p==null&&q==null) {
            return true;
        }
        if (p==null||q==null) {
            return false;
        }
        if (p.val!=q.val) {
            return false;
        }
        return fun(p.left, q.left)&&fun(p.right, q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       TreeNode p = search(root, subRoot.val);
       return fun(p, subRoot);
    }
}

public class SubtreeOfAnotherTree {

}
