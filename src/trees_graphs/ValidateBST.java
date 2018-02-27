package trees_graphs;

import public_class.TreeNode;

public class ValidateBST {

    /*
    Implement a function to check if a binary tree is a binary search tree.
     */

    public boolean isBST(TreeNode root) {
        return isBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean isBSTHelper(TreeNode root, Long min, Long max) {
        if (root == null) return true;
        if (root.key <= min || root.key >= max) return false;
        return isBSTHelper(root.left, min, (long)root.key) && isBSTHelper(root.right, (long)root.key, max);
    }

}
