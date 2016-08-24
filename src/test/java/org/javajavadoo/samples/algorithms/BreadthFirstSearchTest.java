package org.javajavadoo.samples.algorithms;

import org.javajavadoo.samples.model.Node;
import org.javajavadoo.samples.model.NodeList;
import org.javajavadoo.samples.model.Tree;
import org.junit.Assert;

public class BreadthFirstSearchTest {

    /**
     * Test for the tree:
     *        A
     *
     * The result is A
     *
     */
    @org.junit.Test
    public void shouldVisitJustRoot(){

        Node node01 = new Node("A");
        Tree tree = new Tree();
        tree.setRoot(node01);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        NodeList result = bfs.execute(tree);
        Assert.assertEquals(result.getOrderChain(), "A");
    }

    /**
     * Test for the tree:
     *        A
     *      |  |
     *      B  C
     *     ||| |
     *     DEF G
     *
     * The result is A-B-C-D-E-F-G
     *
     */
    @org.junit.Test
    public void shouldVisit3LevelNodes(){

        Node node01 = new Node("A");
        Node node11 = new Node("B");
        Node node12 = new Node("C");
        Node node21 = new Node("D");
        Node node22 = new Node("E");
        Node node23 = new Node("F");
        Node node24 = new Node("G");

        node01.addChildren(node11, node12);
        node11.addChildren(node21, node22, node23);
        node12.addChildren(node24);

        Tree tree = new Tree();
        tree.setRoot(node01);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        NodeList result = bfs.execute(tree);
        Assert.assertEquals("A-B-C-D-E-F-G", result.getOrderChain());
    }
}