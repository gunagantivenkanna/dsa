package linkedlist.single;

import static linkedlist.single.SingleLinkedListImpl.printt;

public class SortLL {
    public static void main(String[] args) {
        Node head = CreateLL.createLL(9);
        printt(head);
//        boolean isPalindrome = DetectLoop.checkPalindrome(head);
//        System.out.println(isPalindrome);
        insertNode(head);
        printt(head);
    }

    private static void insertNode(Node head) {
        int k=4;
        Node n=new Node(12);
        Node temp=head;
        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
        n.next=temp.next.next;
        temp.next=n;
    }
}
