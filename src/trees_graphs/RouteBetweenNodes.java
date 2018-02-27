package trees_graphs;

import public_class.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {

    /*
    Given a directed graph, design an algorithm to  find out whether there is a route between two nodes.
     */

    /*
    Solution:
    Use breadth first search, when find one node, mark a boolean value to true, when find another node, and
    boolean value is true, return true

    Time: O(n)
    Space: O(n) if all nodes belongs to root.neighbors
     */

    boolean route(GraphNode root, GraphNode a, GraphNode b) {
        if (a == b) return true;
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(root);
        root.visited = true;
        boolean visitedOne = false;
        if (root == a || root == b) visitedOne = true;
        while (!queue.isEmpty()) {
            GraphNode pop = queue.poll();
            for (GraphNode node: pop.neighbors) {
                if (!node.visited) {
                    if (node == a || node == b) {
                        if (visitedOne) return true;
                        visitedOne = true;
                    }
                    queue.offer(node);
                    node.visited = true;
                }
            }
        }
        return false;
    }

}
