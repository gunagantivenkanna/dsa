package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BTRightView {
    public static void main(String[] args) {
         Node node = DfsTreeTraversal.createTree();
        List<List<NodeWithData>> lis = VerticalTraversalBT.verticalTraversalBT(node);
 List<Integer> ans = new ArrayList<>();
    Queue<Node> q = new ArrayDeque<>(List.of(node));
        System.out.println();
        List<NodeWithData> list = VerticalTraversalBT.getNodes();
//        printRight(lis);
    }

    private static void printRight(List<List<NodeWithData>> lis) {

        for (List<NodeWithData> nodeWithData:lis){
            if(nodeWithData.size()==1){
                int data = nodeWithData.get(0).node.data;
                System.out.print(data+" ");
                continue;
            }
            System.out.print(nodeWithData.get(nodeWithData.size()-1).node.data+" ");
        }
    }


}
