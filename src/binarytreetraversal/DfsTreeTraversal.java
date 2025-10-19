package binarytreetraversal;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class DfsTreeTraversal {
    public static void main(String[] args) {
        System.out.println("tree traversal");

        preOrderTraversal(createTree());//10,20,40,50,30,60,70
//inOrderTraversal(createTree());
//postOrderTraversal(node);

    }

    public static Node createTree() {
        Node node = new Node(10);
        insertNode(node, 20);
        insertNode(node, 30);
        insertNode(node, 40);
        insertNode(node, 50);
        insertNode(node, 60);
        insertNode(node, 70);
        insertNode(node, 80);
        insertNode(node, -90);
        insertNode(node, 100);

        return node;
    }

    static void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);

        postOrderTraversal(node.right);
        System.out.print(node.data + "  ");
    }

    private static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + "  ");
        inOrderTraversal(node.right);
    }

    private static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "  ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    private static void printTree(Node node) {

    }

    private static void insertNode(Node node, int data) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp.left == null) {
                temp.left = new Node(data);
                break;
            } else {
                queue.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node(data);
                break;

            } else {
                queue.add(temp.right);
            }
        }
        ;
    }



}
