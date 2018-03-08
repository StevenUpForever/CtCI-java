package trees_graphs;

import public_class.TreeNode;

import java.util.HashSet;

public class PathWithSum {

    /*
    You are given a binary tree in which each node contains an integer value (which might be positive or negative).
     Design an algorithm to count the number of paths that sum to a given value.
     The path does not need to start or end at the root or a leaf, but it must go downwards
     (traveling only from parent nodes to child nodes).
     */

    private int res = 0;
    int pathWithSum(TreeNode root, int target) {
        pathWithSumHelper(root, 0, target, new HashSet<>());
        return res;
    }

    private void pathWithSumHelper(TreeNode root, int cur, int target, HashSet<Integer> set) {
        if (root == null) return;
        cur += root.key;
        if (set.contains(target - cur)) res++;
        set.add(cur);
        pathWithSumHelper(root.left, cur, target, set);
        pathWithSumHelper(root.right, cur, target, set);
        set.remove(cur);
    }

}
