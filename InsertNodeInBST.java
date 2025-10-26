public class InsertNodeInBST {

    // * Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            TreeNode newNode = new TreeNode();
            newNode.val = val;
            TreeNode cur = root;
            while (cur != null) {
                if (val > cur.val) {
                    cur = cur.right;
                } else {
                    cur = cur.left;
                }
            }
            if (val > cur.val) {
                cur.right = newNode;
            } else {
                cur.left = newNode;
            }
            return root;
        }

    }
}
