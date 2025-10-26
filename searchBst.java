public class searchBst {

    int searchBst(Node root, int x) {
        while (root != null) {
            if (x == root.data) {
                return root.data; // found
            } else if (x < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return -1; // not found
    }
}