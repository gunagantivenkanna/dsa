package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

public class MaxPathSum {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        int maxSum[]={0};
        findMaxPath(node,maxSum);
        System.out.println(maxSum[0]);
    }

    private static int findMaxPath(Node node, int[] maxSum) {
        if(node==null)return 0;
        int leftdata=Math.max(0,findMaxPath(node.left,maxSum));
        int rightdata=Math.max(0,findMaxPath(node.right,maxSum));
        maxSum[0]=Math.max(maxSum[0],leftdata+rightdata+node.data);
        System.out.println(leftdata+" "+rightdata+" "+maxSum[0]);
    return node.data+Math.max(leftdata,rightdata);
    }
}
