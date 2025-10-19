package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        Node node= DfsTreeTraversal.createTree();
        System.out.println(isSymmetric(node));
    }

    private static boolean isSymmetric(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                Node temp=queue.poll();

            }
        }
        return true;
    }
}
