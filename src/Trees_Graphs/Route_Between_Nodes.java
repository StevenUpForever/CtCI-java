package Trees_Graphs;

import PublicClass.GraphNode;

public class Route_Between_Nodes {

    /*
    Given a directed graph, design an algorithm to  find out whether there is a route between two nodes.
     */

    boolean route(GraphNode a, GraphNode b) {
        if (a == null) return false;
        if (a == b) return true;
        boolean res = false;
        for (GraphNode node: a.neighbors) {
            res |= route(node, b);
        }
        return res;
    }


}
