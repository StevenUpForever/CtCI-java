package Trees_Graphs;

import PublicClass.TreeNode;

public class Successor {

    /*
    Write an algorithm to  nd the "next" node (i.e., in-order successor) of a given node in a binary search tree. You may assume that each node has a link to its parent.
     */

    /*
    BST 里 inorder next应该是紧挨着比node大的那个node，因为inorder BST是一个ascending array，所以

     */
    TreeNode nextNode(TreeNode node) {
        if (node == null) return node;
        /*
        当右子树不为null时，比如在左子树但是有右子树，or在右子树，找右子树的最左点
         */
        if (node.right != null) return leftMost(node.right);
        else {
            /*
            如果没有右子树，需要找到parent node 在其右边的第一个
             */
            TreeNode p = node.parent;
            while (p != null && p.left != node) {
                node = p;
                p = p.parent;
            }
            return p;
        }
    }

    private TreeNode leftMost(TreeNode root) {
        while (root != null && root.left != null) root = root.left;
        return root;
    }

}
