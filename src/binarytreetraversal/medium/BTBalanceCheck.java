package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Stack;

public class BTBalanceCheck {
    public static void main(String[] args) {
//        Node node = DfsTreeTraversal.createTree();
//        System.out.println(checkBalanced(node));
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right=new Node(15);
        root.right.left=new Node(15);
        root.left.left.left = new Node(2);

        System.out.println(recursiceHeight(root));
    }

    private static boolean recursiceHeight(Node node) {

        boolean[] isBalanced = {true};
        helper(node, isBalanced);
        return isBalanced[0];
    }

    private static int helper(Node node, boolean[] isBalanced) {
        if (node == null) {
            return 0;
        }
        int lheight = helper(node.left, isBalanced);
        int rheight = helper(node.right, isBalanced);
        if (lheight - rheight > 1) {
            isBalanced[0] = false;
        }
        return 1 + Math.max(lheight, rheight);
    }

    private static boolean checkBalanced(Node root) {

        Deque<Node> stack = new ArrayDeque<>();
        stack.add(root);
        Node current = root;
        int max = 1;
        int diff = 0;
        while (!stack.isEmpty()) {
            int height = 1;
            while (current != null) {
                stack.push(current);
                current = current.left;
                max = Math.max(max, height);
                height++;
            }
            Node temp = stack.pop();
            current = temp.right;
            if (current == null) {
                diff++;
            } else {
                diff = 0;
            }
            if (diff == 2) return false;
        }

        System.out.println(max);
        return true;
    }
}
