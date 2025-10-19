package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BTHeight {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();

        System.out.println(findHeight(node, 0));
        System.out.println(recursiceHeight(node));
    }

    private static int recursiceHeight(Node node) {


        if (node==null){
            return 0;
        }
        int lheight=recursiceHeight(node.left);
        int rheight=recursiceHeight(node.right);
        return 1+Math.max(lheight,rheight);
    }

    private static int findHeight(Node node, int height) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }

            height++;
        }
        return height;

    }
}
