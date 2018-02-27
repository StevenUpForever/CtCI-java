package trees_graphs;

import public_class.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepths {

    /*
    Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
     */

    /*
    Solution 1:
    Use breadth first search and add to lists
    Time: O(n)
    Space: O(n) Queue push nodes if there's only 1-3 nodes
     */

    List<List> createLists(TreeNode root) {
        List<List> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<TreeNode> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                list.add(poll);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            res.add(list);
        }
        return res;
    }

    /*
    Solution 2:
    DFS, insert node into lists[index]

    Time: O(n)
    Space: O(n) if the tree is not balanced
     */

}
