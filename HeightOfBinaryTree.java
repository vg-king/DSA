import java.util.LinkedList;
import java.util.Queue;
public class HeightOfBinaryTree {
    
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
 
class Solution {
    
    
    public int maxDepth(TreeNode root) {
        int count=0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null) {
            return 0;
        } 
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left!=null) {
                    queue.offer(queue.peek().left);
                }if (queue.peek().right!=null) {
                    queue.offer(queue.peek().right);
                }

            }
            count++;
        }
        return count;
    }
}
