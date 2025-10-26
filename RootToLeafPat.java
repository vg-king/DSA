import java.util.List;
import java.util.ArrayList;
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}


class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        path.add(root.data);
        boolean visited=false;
        Node temp = root;
        while (true) {
            if(temp==null) break;
            if (temp.right!=null&&visited==false) {
                path.add(temp.right.data);
                visited=true;
                mainList.add(path);
            }if (temp.left!=null&&visited==false) {
                path.add(temp.left.data);
                visited=true;
                mainList.add(path);
            }
        }
        return mainList;
    }
}
public class RootToLeafPat {
    public static void main(String[] args) {
        
    }
}
