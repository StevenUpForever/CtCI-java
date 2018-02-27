package trees_graphs;

import public_class.TreeNode;

public class FirstCommonAncestor {

    public TreeNode LCA(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null || root == a || root == b) return root;
        TreeNode left = LCA(root.left, a, b);
        TreeNode right = LCA(root.right, a, b);
        if (left != null && right != null) return root;
        else return left == null ? right : left;
    }

}
