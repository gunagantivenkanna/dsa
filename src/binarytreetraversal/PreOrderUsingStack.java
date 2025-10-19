package binarytreetraversal;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreOrderUsingStack {
    public static void main(String[] args) {
//        stackPreorder(DfsTreeTraversal.createTree());
//        stackPostorder(DfsTreeTraversal.createTree());
        stackInorder(DfsTreeTraversal.createTree());
    }

    private static void stackInorder(Node tree) {
        Stack<Node> stack = new Stack();
        Node current = tree;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.add(current);
                current = current.right;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.left;
        }
    }


    private static void stackPostorder(Node root) {
        Stack<Node> stack = new Stack();
        stack.add(root);
        while (true) {
            Node temp = stack.peek();
            if (temp.right != null) {
                stack.add(temp.right);
            } else break;
            if (temp.left != null) {
                stack.add(temp.left);
            } else break;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + "-");
        }

    }

    private static void stackPreorder(Node root) {
        Stack<Node> stack = new Stack();
        stack.add(root);
        Stack<Integer> queue = new Stack<>();
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            if (temp.right != null) {
                stack.add(temp.right);
            }
            System.out.print(temp.data + "-");
            queue.add(temp.data);
            if (temp.left != null) {
                stack.add(temp.left);
            }
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.pop() + " ");
        }

    }
}
