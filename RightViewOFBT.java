import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class RightViewOFBT {

    
//  * Definition for a binary tree node.
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
    class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> mpp = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            TreeNode temp = it.node;
            if(mpp.get(hd)==null) mpp.put(hd,temp.val);
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd+1));
                
            }
            
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
                
            }
            

        }
           for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;

    }
}
}