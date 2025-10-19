package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.*;

class NodeWithData {
    int col;
    int row;
    Node node;

    NodeWithData(Node node, int col, int row) {
        this.node = node;
        this.col = col;
        this.row = row;
    }
}

public class VerticalTraversalBT {
static List<NodeWithData> temp1 = new ArrayList<>();

    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        verticalTraversalBT(node);
    }

     static List<List<NodeWithData>> verticalTraversalBT(Node node) {
        Queue<NodeWithData> queue = new LinkedList<>();
        queue.add(new NodeWithData(node, 0, 0));
        Map<Integer, List<NodeWithData>> map = new TreeMap<>();
        List<List<NodeWithData>> listObjs = new ArrayList<>();

        while (!queue.isEmpty()) {
List<NodeWithData> listObj = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                NodeWithData nodeWithData = queue.poll();
                Node temp = nodeWithData.node;
                int row = nodeWithData.row;


                if (temp.left != null) queue.add(new NodeWithData(temp.left, nodeWithData.col - 1, row + 1));

                if (temp.right != null) queue.add(new NodeWithData(temp.right, nodeWithData.col + 1, row + 1));
                map.computeIfAbsent(nodeWithData.col, l -> new ArrayList<>())
                        .add(nodeWithData);
                listObj.add(nodeWithData);//add only to new list when key is different else add to existing list

            temp1.add(nodeWithData);
            }
            listObjs.add(listObj);
//            row++;
        }

//        List<Map<Integer,Integer>> list=new ArrayList<>();

//            if (!map.containsKey(nodeWithData.col)) {
//                map.put(nodeWithData.col, new ArrayList<>());
//            }
//            map.get(nodeWithData.col).add(nodeWithData.node.data);

//sort with row of same row sort with node data

        List<List<Integer>> list1 = new ArrayList<>();
        for (List<NodeWithData> nodeWithData : map.values()) {
            nodeWithData.sort((a, b) -> {
                if (a.row != b.row) return Integer.compare(a.row, b.row);
                return Integer.compare(a.node.data, b
                        .node.data);
            });
            List<Integer> list = new ArrayList<>();
            for (NodeWithData nodeWithData1 : nodeWithData) {
                list.add(nodeWithData1.node.data);
            }
            list1.add(list);
        }


        System.out.println(list1);

        return listObjs;
    }
    static  List<NodeWithData> getNodes(){
        return temp1;
    }


}



