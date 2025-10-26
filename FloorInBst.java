// User function Template for Java

class Solution {
       int searchBst(Node root, int x) {
        while (root != null) {
            if (x == root.data) {
                return root.data; 
            } else if (x < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return -1; 
    }
    int findMin(Node root,int x){
        if (root==null) {
            return 0;
        }
        int leftMin = findMin(root.left, x);
        int rightMin = findMin(root.right, x);
        int minValue = Math.min(x,Math.min(leftMin, rightMin));
        if (minValue==x) {
            return -1;
        }
        return minValue;
    }
    public  int floor(Node root, int x) {
        int y = searchBst(root, x);
        if (y==-1) {
            y = findMin(root, x);
        }
        return y;
        
    }
}
public class FloorInBst {
    
}
