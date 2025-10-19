package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;


public class Boundaries {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        printBoundaries(node.left, node.right);
    }



    private static void printBoundaries(Node left, Node right) {
        if (left == null && right == null) return;
        if (left != null && right != null) {
            System.out.println(left.data + " " + right.data);
            printBoundaries(left.left, right.right);
        }
        else if(left!=null){
            printLeft(left);
        } else if (right!=null) {
            printRightt(right);
        }
    }

    private static void printRightt(Node right) {
        if(right==null)return;
        System.out.println(right.data);
        printRightt(right.right);
    }

    private static void printLeft(Node left) {
            if(left==null)return;
        System.out.println(left.data);
        printRightt(left.left);
    }
}
