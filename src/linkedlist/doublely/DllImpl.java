package linkedlist.doublely;

public class DllImpl {
    public static void main(String[] args) {
        Node head = new Node(20);
//        printtDll(head);
        head = insertAtHead(head, 10);
        head = insertAtHead(head, 5);
//        System.out.println(head.data);
//        printtDll(head);
        head = insertAtTail(head, 30);
//        System.out.println();
//            printtDll(head);
        head = insertAtTail(head, 40);

        head = insertAtPos(head, 25);
        printtDll(head);
        head = reverseDll(head);
        ;
        printtDll(head);
        printtDllPrev(head);
    }

    private static Node reverseDll(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node next = temp.next; // save next node

            temp.next = prev;      // reverse forward link
            temp.prev = next;      // reverse backward link

            prev = temp;           // move prev forward
            temp = next;
        }
        return prev;
    }

    private static Node insertAtPos(Node head, int data) {
        Node newNode = new Node(data);
        int pos = 4;
        Node temp = head;
        int i = 1;
        while (i < pos - 1 && temp.next != null) {
            i++;
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
//        newNode.prev = temp;
        if (newNode.next != null)
            newNode.next.prev = newNode;
        ;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
//        printtDllPrev(tail);
        return head;

    }

    private static void printtDllPrev(Node tail) {
        Node t=tail;
         while (t.next != null) {
            t = t.next;
        }
        System.out.println(t.data);
        while (t != null) {
            System.out.print(t.data + "<-->");
            t = t.prev;
        }
    }

    private static Node insertAtTail(Node head, int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    private static Node insertAtHead(Node head, int i) {
        Node newNode = new Node(i);
        head.prev = newNode;
        newNode.next = head;
        return newNode;
    }

    private static void printtDll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println();
    }
}
