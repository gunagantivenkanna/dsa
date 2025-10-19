package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.*;

public class TopViewBT {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        List<List<NodeWithData>> list = VerticalTraversalBT.verticalTraversalBT(node);
        List<List<NodeWithData>> list1 = new ArrayList<>();
//list.sort((a,b)->Integer.compare(a.row,b.row));
        int leftcol = 0;
        int rightCol = 0;
        for (List<NodeWithData> nodeWithData : list) {
            if (nodeWithData.size() == 1&&nodeWithData.get(0).row==0) {
                System.out.print(nodeWithData.get(0).node.data + " ");
                continue;
            }
            for (NodeWithData nodeWithData1 : nodeWithData) {
                if (nodeWithData1.node.data == 20) {
//                    System.out.println(col);
                }
//                System.out.println(nodeWithData1.node.data+" "+ nodeWithData1.col);
                if (nodeWithData1.col < leftcol) {
                    System.out.print(nodeWithData.get(0).node.data + " ");
                    leftcol = nodeWithData1.col;
                } else if (nodeWithData1.col > rightCol) {
                    System.out.print(nodeWithData.get(nodeWithData.size() - 1).node.data + " ");
                    rightCol = nodeWithData1.col;
                }
            }


        }
//        System.out.println(list);
//        printTop(list);

    }

    private static void printTop(List<List<NodeWithData>> list) {

        for (int i = 0; i < list.size(); i++) {
            for (NodeWithData nodeWithData : list.get(i)) {
                System.out.print(nodeWithData.node.data + " " + " " + nodeWithData.row + " " + nodeWithData.col + " ");
            }
            System.out.println();
        }


    }
}
