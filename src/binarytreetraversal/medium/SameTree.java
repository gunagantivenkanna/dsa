package binarytreetraversal.medium;


import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public static void main(String[] args) {

        Node pnode = DfsTreeTraversal.createTree();
        Node qNode = new Node(1);

        boolean isSame = isSame(pnode, qNode);
        System.out.println(isSame);

        boolean isSamew = isSamewithStack(pnode, qNode);
        System.out.println(isSamew);
    }

    private static boolean isSame(Node pnode, Node qNode) {
        Queue<Node[]> queue = new LinkedList<>();
        queue.add(new Node[]{pnode, qNode});
        while (!queue.isEmpty()) {
            Node[] temp = queue.poll();
            Node node1 = temp[0];
            Node node2 = temp[1];
            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null) {
                System.out.println("came here");
                return false;
            }
            ;
            if (node1.data != node2.data) {
                System.out.println("last");
                return false;
            }
            queue.add(new Node[]{node1.left, node2.left});
            queue.add(new Node[]{node1.right, node2.right});
        }
        return true;
    }

    private static boolean isSamewithStack(Node pnode, Node qNode) {
        Deque<Node[]> stack = new LinkedList<>();
        stack.add(new Node[]{pnode, qNode});
        while (!stack.isEmpty()) {
            Node[] temp = stack.pop();
            Node node1 = temp[0];
            Node node2 = temp[1];
            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null) {
                System.out.println("came here");
                return false;
            }
            ;
            if (node1.data != node2.data) return false;
            stack.add(new Node[]{node1.right, node2.right});
            stack.add(new Node[]{node1.left, node2.left});
        }
        return true;
    }

}
//class Node{
//    int val;
//    Node p,q;
//    Node(int val){
//        this
//                .val=val;
//    }
//
//}