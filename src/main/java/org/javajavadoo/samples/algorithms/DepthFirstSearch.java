package org.javajavadoo.samples.algorithms;

import org.javajavadoo.samples.model.Node;
import org.javajavadoo.samples.model.NodeList;
import org.javajavadoo.samples.model.Tree;

import java.util.*;

class DepthFirstSearch {


    public NodeList execute(Tree tree) {

        Stack<Node> stack = new Stack<>();

        //Queue the root
        Node root = tree.getRoot();
        stack.push(root);
        root.visit();

        NodeList result = new NodeList();
        while (!stack.isEmpty()) {
            Node item = stack.pop();
            result.addNode(item);

            //For each child not visited
            List<Node> children = item.getChildren();
            Collections.reverse(children);
            children.stream().filter(child -> !child.isVisited()).forEach(child -> {
                stack.push(child);
                child.visit();
            });
        }
        return result;
    }

}
