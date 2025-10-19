package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.*;

public class ZigZagBT {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        printZigZag(node
        );

    }

    private static void printZigZag(Node node) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        boolean isReversed=false;
        List<List<Integer>> listfull=new ArrayList<>();
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>(Collections.nCopies(queue.size(),0));
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                Node temp=queue.poll();
                int index=isReversed?(size-1-i):i;
                list.set(index,temp.data);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null)queue.add(temp.right);
            }
            isReversed=!isReversed;
            listfull.add(list);
        }

        System.out.println(listfull);

    }
}
