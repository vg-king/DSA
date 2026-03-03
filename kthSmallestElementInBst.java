import java.util.ArrayList;
import java.util.List;
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
    void inOrder(TreeNode root,List<Integer> list){
        if(root==null) return ;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int ans=0;
        for (int i = 0; i < k; i++) {
            ans = list.get(i);
        }
        return ans;
    }
}
public class kthSmallestElementInBst {
    
}
