package org.javajavadoo.samples.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    private final String value;
    private final List<Node> children;
    private boolean visited;

    public Node(String value) {
        this.value = value;
        this.children = new ArrayList<>();
        this.visited = false;
    }

    public void addChildren(Node... nodes) {
        children.addAll(Arrays.asList(nodes));
    }

    public List<Node> getChildren() {
        return children;
    }

    public String getValue() {
        return value;
    }

    public boolean isVisited(){
        return this.visited;
    }

    public void visit(){
        this.visited = true;
    }
}
