package trees_graphs;


import public_class.TreeNode;

public class Minimal_Tree {

    /*
    Given a sorted (increasing order) array with unique integer elements, write an algo­
rithm to create a binary search tree with minimal height.
     */

    /*
    Min height use mid value as current root, and recursively build left and right sub tree depends on current scope values
     */

    public TreeNode buildBST(int[] array) {
        if (array == null) return null;
        return buildBSTHelper(array, 0, array.length - 1);
    }

    private TreeNode buildBSTHelper(int[] array, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left)/2;
        TreeNode root = new TreeNode(array[mid]);
        root.left = buildBSTHelper(array, left, mid - 1);
        root.right = buildBSTHelper(array, mid + 1, right);
        return root;
    }

}
