package com.greatlearning.Question2.Drivers;

import com.greatlearning.Question2.Services.Node;

import static com.greatlearning.Question2.Services.BinarySearchTreeIntoSkewedTree.*;

public class MainBST {
    public static void main(String[] args) {
        node = new Node(50);
        node.left = new Node(30);
        node.right = new Node(60);
        node.left.left = new Node(10);
        node.right.left = new Node(55);

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

