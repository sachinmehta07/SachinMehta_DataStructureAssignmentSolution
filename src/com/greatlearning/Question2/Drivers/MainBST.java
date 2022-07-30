package com.greatlearning.Question2.Drivers;

import com.greatlearning.Question2.Services.BinarySearchTreeIntoSkewedTree;
import com.greatlearning.Question2.Services.Node;
import static com.greatlearning.Question2.Services.BinarySearchTreeIntoSkewedTree.*;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTreeIntoSkewedTree tree = new BinarySearchTreeIntoSkewedTree();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

        int order = 0;
        ConvertBTToSkewed(node, order);
        traverseRightSkewed(headNode);
    }
}

/*
OUTPUT :
10 30 50 55 60
Process finished with exit code 0
*/

