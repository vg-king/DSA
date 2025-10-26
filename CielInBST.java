class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} 

class Solution {
    int searchBst(Node root,int x){
          while(root!=null&&root.data!=x){
            if(x<root.data){
                root = root.left;
                
            }
            else if(x>root.data){
                
                root=root.right;
               
            }
            else{
                return -1;
                
            }
        }
        return root.data;
    }
    int findCeil(Node root, int x) {
        // code here
        
        int y = searchBst( root, x);
        if(y==-1){
            y=searchBst(root,x+1);
        }
        return y;
    }
}
public class CielInBST {
    
}
