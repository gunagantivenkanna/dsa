package binarytreetraversal;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<Integer> l=postorderTraversal(DfsTreeTraversal.createTree());
        System.out.println(l);
        List<Integer> list=new ArrayList<>();
        porderTraversal(DfsTreeTraversal.createTree(),list);
        System.out.println(list);
    }
    static void porderTraversal(Node node,List<Integer> list){
        if(node==null){
            return ;
        }
        porderTraversal(node.left,list);
        porderTraversal(node.right,list);
        list.add(node.data);
        return ;
    }
    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> list=new ArrayList<>();
        helper(list,root);
        return list;

    }
    static void helper(List<Integer> list,Node node){
if(node==null){
            return ;
        }
        helper(list,node.left);
        helper(list,node.right);
        list.add(node.data);
    }
}