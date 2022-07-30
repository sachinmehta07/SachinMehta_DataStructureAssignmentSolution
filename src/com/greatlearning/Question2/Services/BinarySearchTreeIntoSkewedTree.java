package com.greatlearning.Question2.Services;

public class BinarySearchTreeIntoSkewedTree {
    public static Node node;
    static Node prevNode = null;
    public static Node headNode = null;
    public static void ConvertBTToSkewed(Node root, int order) {

        if (root == null) {
            return;
        }
        if (order > 0) {
            ConvertBTToSkewed(root.right, order);
        } else {
            ConvertBTToSkewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;

        if (headNode == null) {
            headNode = root;
        } else {
            prevNode.right = root;
        }
        root.left = null;
        prevNode = root;

        if (order > 0) {
            ConvertBTToSkewed(leftNode, order);
        } else {
            ConvertBTToSkewed(rightNode, order);
        }
    }
    public static void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }
}
