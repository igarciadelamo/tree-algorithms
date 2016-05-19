package org.javajavadoo.samples.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String value;
    private List<Node> children;
    private boolean visited;

    public Node(String value) {
        this.value = value;
        this.children = new ArrayList<>();
        this.visited = false;
    }


    public void addChild(Node child) {
        children.add(child);
    }

    public void addChildren(Node... nodes) {
        for(Node child: nodes) {
            children.add(child);
        }
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
