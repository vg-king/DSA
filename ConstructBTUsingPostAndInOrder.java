
//  * Definition for a binary tree node.

import java.util.Map;
import java.util.HashMap;

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          Map<Integer,Integer> inMap= new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        TreeNode root = build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,inMap);
        return root;
    }
     public TreeNode build(int postorder[],int proStart,int proEnd,int []inorder,int inStart,int inEnd,Map<Integer,Integer> inMap){
        if(proStart>proEnd||inStart>inEnd) return null;
        TreeNode root = new TreeNode(postorder[proStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot-1;
        root.left = build(postorder, proStart+1, numsLeft, inorder, inStart, inRoot-1, inMap);
        root.right = build(postorder, proStart+numsLeft+1, proEnd, inorder, inRoot+1, inEnd, inMap);
        return root;
    }
}

public class ConstructBTUsingPostAndInOrder {
    
}
