package linkedlist.single;

public class ReverseSLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        SingleLinkedListImpl.printt(head);
        System.out.println();
//        Node h = reverseLL(head);
//        SingleLinkedListImpl.printt(h);
        Node cur = head;
        Node next = cur;
        Node prev = null;
        Node rh=recursiveReverseLL(prev,cur,next);
        SingleLinkedListImpl.printt(rh);
    }

    private static Node recursiveReverseLL( Node prev, Node cur, Node next) {

        if(cur==null) return prev
        ;
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
        return recursiveReverseLL(prev,cur,next);
    }


    private static Node reverseLL(Node head) {
        Node cur = head;
        Node next = cur;
        Node prev = null;
        while (cur != null) {
            next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
//            if(next!=null)

//            System.out.println(next.data);

        }
        return prev;

    }
}
