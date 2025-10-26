// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }
class Solution {
    int maxSize = 0;
     int countNodes(Node root){
        if(root==null) return 0;
        int left = countNodes(root.left);
        int right  = countNodes(root.right);
        return left+right+1;
    }
    
    boolean isValidBST(Node root, long min, long max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }
    void findLargestBST(Node root){
        if(root==null) return ;
        if(isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE)){
            int size = countNodes(root);
            maxSize = Math.max(size,maxSize);
            
        }
        findLargestBST(root.left);
        findLargestBST(root.right);
        
    }
    // Return the size of the largest sub-tree which is also a BST
     int largestBst(Node root) {
      maxSize = 0;
      findLargestBST(root);
      return maxSize;
        
    }
}
public class LargestBst {
    
}
