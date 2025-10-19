package linkedlist.single;

public class SingleLinkedListImpl {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(200);
        Node node5 = new Node(2000);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        int target = 200;

        traversee(head);
        System.out.println();

        System.out.println(searchh(target, head));

        Node head1 = null;
//        head1 = insertNodeatFirst(head1, 10);
//        head1 = insertNodeatFirst(head1, 230);
//
//
        head1 = insertAtEnd(head1, 1);
        head1 = insertAtEnd(head1, 2);
        head1 = insertAtEnd(head1, 3);
        head1 = insertAtEnd(head1, 4);
//        while (head1 != null) {
//            System.out.print(head1.data + "->");
//            head1 = head1.next;
//        }
        Node middleNode = new Node(900);
        insertMiddle(head1, middleNode);
        printt(head1);
//        deleteFirst(head1);
       head1= deleteAny(6, head1);
        System.out.println();
        printt(head1);
    }

     static void printt(Node head1) {
            System.out.println();

        while (head1 != null) {
            System.out.print(head1.data + "-");
            head1 = head1.next;
        }
            System.out.println();

    }

    private static Node deleteAny(int pos, Node head1) {
        Node temp = head1;
        if (pos == 1) {
            head1 = head1.next;
            return head1;
        }
        for (int j = 1; j < pos - 1; j++) {
            temp = temp.next;
        }
        if (temp==null||temp.next==null)return head1;
        temp.next = temp.next.next;
        return head1;
    }

    private static void deleteFirst(Node head1) {
    }

    private static void insertMiddle(Node head1, Node middleNode) {
        int pos = 3;
        Node temp = head1;


        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        middleNode.next = temp.next;
        temp.next = middleNode;


    }

    static Node insertAtEnd(Node head1, int i) {
        Node newNode = new Node(i);
        if (head1 == null) return newNode;
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head1;
    }

    private static Node insertNodeatFirst(Node node5, int data) {
        Node head = new Node(data);
        head.next = node5;
        return head;
    }

    private static boolean searchh(int target, Node head) {
        while (head != null) {
            if (target == head.data) return true;
            head = head.next;
        }
        return false;
    }


    private static void traversee(Node node1) {
        while (node1 != null) {
            System.out.print(node1.data + "-->");
            node1 = node1.next;
        }
    }
}
