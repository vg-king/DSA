
//   Definition for a binary tree node.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    void dfs(TreeNode root, ArrayList<ArrayList<TreeNode>> list, ArrayList<TreeNode> path){
        if(root==null) return;
        path.add(root);
        if(root.left==null&&root.right==null) {
            list.add(new ArrayList<>(path));
        }
        dfs(root.left, list, path);
        dfs(root.right, list, path);
        path.remove(path.size()-1);
    }

    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         ArrayList<ArrayList<TreeNode>> list = new ArrayList<>();
        ArrayList<TreeNode> path = new ArrayList<>();
        dfs(root, list, path);
     Set<TreeNode> common = new HashSet<>(list.get(0));
     for (int i = 0; i < list.size(); i++) {
        common.retainAll(list.get(i));
     }
     ArrayList<TreeNode> commonList = new ArrayList<>(common);
     return commonList.get(0);
    }
}
public class LowestCommonAncestorofBinaryTree {
    
}
