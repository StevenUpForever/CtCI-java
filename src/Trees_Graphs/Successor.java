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
        if (node.right != null) return node.right;
        else {
            while (node.key )
        }
    }

}
