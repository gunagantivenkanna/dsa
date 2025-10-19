package binarytreetraversal.medium;

import binarytreetraversal.DfsTreeTraversal;
import binarytreetraversal.Node;

import java.util.Arrays;

public class BTDiameter {
    public static void main(String[] args) {
        Node root = DfsTreeTraversal.createTree();
        int[] max=new int[1];
        int lenght=printDiameter(root,max);
        System.out.println(max[0]);

    }

    /*
    *        10
    *       /
    *      20
    *     /  \
    *    40  50
    *
    * */

   private static int printDiameter(Node root, int[] max) {
    if (root == null) return 0;

    int lh = printDiameter(root.left, max);
    int rh = printDiameter(root.right, max);

    max[0] = Math.max(max[0],  lh+rh);

    return 1 + Math.max(lh, rh);
}

}
