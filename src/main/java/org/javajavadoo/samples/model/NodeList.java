package org.javajavadoo.samples.model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NodeList {

    private final List<Node> list;

    public NodeList() {
        this.list = new ArrayList<>();
    }

    public void addNode(Node node){
        list.add(node);
    }

    public String getOrderChain(){
        return list.stream().map(Node::getValue).collect(Collectors.joining("-"));
    }
}
