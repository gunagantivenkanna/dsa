package binarytreetraversal;

import java.util.*;

public class BfsTraversal {
    public static void main(String[] args) {
        System.out.println("Bfs traversal");
        Node node = DfsTreeTraversal.createTree();
//        bfs(node);
//        List<List<Integer>> nodes = zigZag(node);
//        System.out.println(nodes);
        reverseLevelOrder(node);
    }

    private static void reverseLevelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        List<List<Integer>> list=new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> list1=new ArrayList<>();
            int size= queue.size();
            for (int i = 0; i <size ; i++) {
                Node temp = queue.poll();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
                list1.add(temp.data);
            }
            list.add(list1);

        }
//        System.out.println(list);
        for (int i = list.size()-1; i >=0; i--) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+"-->");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> zigZag(Node node) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int leftToRight = 1;
        List<List<Integer>> nodes = new ArrayList<>();

        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>(Collections.nCopies(queue.size(), 0));
            System.out.println(queue.size());
            int size
                    = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                int index = leftToRight==1 ? i : (size - 1 - i);
                levelNodes.set(index, temp.data);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            nodes.add(levelNodes);
            System.out.println(nodes);
            leftToRight = 1-leftToRight;
        }
        return nodes;

    }


    private static void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + "->");
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        System.out.println();
    }
}
