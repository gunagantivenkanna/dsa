package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BottomViewBT {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        List<List<NodeWithData>> lis = VerticalTraversalBT.verticalTraversalBT(node);

        List<NodeWithData> list = VerticalTraversalBT.getNodes();
        System.out.println(list);
        printBottom(list);
    }

    private static void printBottom(List<NodeWithData> list) {
        Map<Integer, Integer> map = new TreeMap();
        for (NodeWithData nodeWithData : list) {
            map.put(nodeWithData.col, nodeWithData.node.data);
        }
        map.forEach((col, data) -> System.out.print(data + " "));
    }
}
