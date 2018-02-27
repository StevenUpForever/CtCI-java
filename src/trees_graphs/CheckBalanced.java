package trees_graphs;

import public_class.TreeNode;

public class CheckBalanced {

    /*
    Implement a function to check if a binary tree is balanced. For the purposes of this question, a balanced tree is de ned to be a tree such that the heights of the two subtrees of any node never differ by more than one.
     */

    /*
    Use Tree bottom up, get current height, if any left height or right height is Int.max or diff larger than 1
    then return int.max, otherwise return max(left, right) + 1, at last, check final height is int.max or not

    Time: O(n)
    Space: O(n)
     */

    boolean isBalanced(TreeNode root) {
        return !(isBalancedHelper(root) == Integer.MAX_VALUE);
    }

    private int isBalancedHelper(TreeNode root) {
        if (root == null) return 0;
        int left = isBalancedHelper(root.left);
        int right = isBalancedHelper(root.right);
        if (left == Integer.MAX_VALUE || right == Integer.MAX_VALUE || Math.abs(left - right) > 1)
            return Integer.MAX_VALUE;
        return Math.max(left, right) + 1;
    }

}
