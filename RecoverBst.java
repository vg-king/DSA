import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
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
    public void inOrder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    void Recover(TreeNode root,List<Integer>list){
        int i = 0;
        if(root==null) return;
        inOrder(root.left,list);
        if(list.get(i)!=root.val) 
        {root.val =  list.get(i);
            i++;
        }
        inOrder(root.right, list);
    }
 
    public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        Collections.sort(list);
        Recover(root, list);
    }
}
public class RecoverBst {
    
}
