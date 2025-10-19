package binarytreetraversal;

import java.util.Stack;

public class PostorderWithOneStack {
    public static void main(String[] args) {
        traversePost(DfsTreeTraversal.createTree());
    }

    private static void traversePost(Node root) {
        Node current=root;
Node lastVisited=null;
        Stack<Node> stack=new Stack<>();
        while(current!=null||!stack.isEmpty()){
            if(current!=null){
                stack.add(current);
                current=current.left;
            }else{
                if(stack.peek().right==null){
                    Node temp=stack.pop();
lastVisited=temp;
                    System.out.print(temp.data+"-");
                    if(stack.peek().right!=temp&&stack.peek().right!=null){
                        current=stack.peek().right;
                    }
                    else {
                        Node temp1=stack.pop();
                        lastVisited=temp1;
                        System.out.print(temp1.data+"-");
                    }
                }else if(stack.peek().right!=lastVisited) {
                    current=stack.peek().right;
                }else{
                System.out.print(stack.peek().data+"-");break;}
            }
        }

    }
}
