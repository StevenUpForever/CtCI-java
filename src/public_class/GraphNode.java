package public_class;

import java.util.*;
public class GraphNode {

    public int key;
    public List<GraphNode> neighbors;
    public boolean visited;
    public GraphNode(int key) {
        this.key = key;
        this.neighbors = new ArrayList<GraphNode>();
        visited = false;
    }

}