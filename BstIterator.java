import java.util.List;
import java.util.ArrayList;
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
class BSTIterator {
    List<Integer> list;
    int index;
    void inOrder(TreeNode root,List<Integer> list){
        if(root==null) return ;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public BSTIterator(TreeNode root) {
           list = new ArrayList<>();
           inOrder(root, list);
           index=0;
       
    }
    
    public int next() {
       if(index<list.size()) index++;
        return list.get(index);
    }
    
    public boolean hasNext() {
        if (index==list.size()) {
            return false;
        }
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
public class BstIterator {
    
}
