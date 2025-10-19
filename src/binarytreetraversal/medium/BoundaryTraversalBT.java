package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BoundaryTraversalBT {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        System.out.print(node
                .data+" ");
        printBoundary(node);
    }

    private static void printBoundary(Node node) {
//    traverse left from root excluding leaf and print every node

        Node leftNode = node.left;
        Node rightNode = node.right;
        while (leftNode != null) {
            if (!(leftNode.left == null && leftNode.right == null))
                System.out.print(leftNode.data + " ");
            leftNode = (leftNode.left != null) ? leftNode.left : leftNode.right;
        }
//        perform dfs to print every leaf node

        printLeaves(node);
        List<Integer> list = new ArrayList<>();
//        traverse right from root excluding leaf and print every node
        while (rightNode != null) {
            if (!(rightNode.left == null && rightNode.right == null))
                list.add(rightNode.data);
            rightNode = (rightNode.right != null) ? rightNode.right : rightNode.left;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }

    private static void printLeaves(Node node) {
        if (node == null) return;
        printLeaves(node.left);
        printLeaves(node.right);
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
    }
}
