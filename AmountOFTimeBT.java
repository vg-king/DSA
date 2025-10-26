import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
class Solution {
        private void markParents(TreeNode root,Map<TreeNode,TreeNode> parent_track,TreeNode target){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left!=null){

                parent_track.put(current.left,current);
                queue.offer(current.left);
            }
            if(current.right!=null){
                parent_track.put(current.right,current);
                queue.offer(current.right);

            }
        }
    }
    public int distance(TreeNode root, TreeNode target) {
        Map<TreeNode,TreeNode> parent_track = new HashMap<>();
        markParents(root,parent_track,root);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode > queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target,true);
        int curr_level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            
            curr_level++;
            
            for(int i = 0;i<size;i++){
                TreeNode current = queue.poll();
                if(current.left!=null &&visited.get(current.left)==null){
                    queue.offer(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null &&visited.get(current.right)==null){
                    queue.offer(current.right);
                    visited.put(current.right,true);
                }
                if(parent_track.get(current)!=null &&visited.get(parent_track.get(current))==null){
                    queue.offer(parent_track.get(current));
                    visited.put(parent_track.get(current),true);
                }
            } 
        }
       return curr_level;
    }
    private TreeNode findNode(TreeNode root, int start) {
    if (root == null) return null;
    if (root.val == start) return root;
    
    TreeNode left = findNode(root.left, start);
    if (left != null) return left;
    
    return findNode(root.right, start);
}
    public int amountOfTime(TreeNode root, int start) {
        TreeNode target = findNode(root, start);  
    
   return distance(root, target);

    }
}
public class AmountOFTimeBT {

    public static void main(String[] args) {
        
    }
}
