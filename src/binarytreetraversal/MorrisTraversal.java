package binarytreetraversal;

public class MorrisTraversal {
    public static void main(String[] args) {
        Node node = DfsTreeTraversal.createTree();
        morrisTraverse(node);
    }

    private static void morrisTraverse(Node root) {
        Node current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + "-");
                current = current.right;
            } else {
                Node pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = current;
                    System.out.print(current.data+" ");//10  20  40  80  90  50  30  60  70  preorder
                    current = current.left;//80-40-90-20-50-10-60-30-70- inorder
                } else {
                    pre.right = null;
                    current = current.right;
                }

            }
        }
    }
}
