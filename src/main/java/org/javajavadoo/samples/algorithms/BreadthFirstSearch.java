package org.javajavadoo.samples.algorithms;

import org.javajavadoo.samples.model.Node;
import org.javajavadoo.samples.model.NodeList;
import org.javajavadoo.samples.model.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {


    public NodeList execute(Tree tree) {

        Queue<Node> queue = new LinkedList<>();

        //Queue the root
        Node root = tree.getRoot();
        queue.add(root);
        root.visit();

        NodeList result = new NodeList();
        while (!queue.isEmpty()) {
            Node item = queue.remove();
            result.addNode(item);

            //For each child not visited
            item.getChildren().stream().filter(child -> !child.isVisited()).forEach(child -> {
                queue.add(child);
                child.visit();
            });
        }
        return result;
    }

}
