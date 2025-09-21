import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LevelOrderTraversal {
    class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if (root==null) {
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left!=null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right!=null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            list.add(subList);


        }
        return list;
    }
}
public static void main(String[] args) {
    
}    
}
