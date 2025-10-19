package linkedlist.single;

import java.util.HashMap;
import java.util.Map;

import static linkedlist.single.CreateLL.createLL;
import static linkedlist.single.SingleLinkedListImpl.insertAtEnd;
import static linkedlist.single.SingleLinkedListImpl.printt;

public class DetectLoop {
    public static void main(String[] args) {
        Node head = createLL(10);
        printt(head);
        System.out.println();
//        createCycleChain(head);
        Node v = detectCycle(head);
//        Node startNode = findStartingPoint(head);
//        int lengthOfLoop = findLoopLength(head, startNode);
        System.out.println();
//        System.out.println("length of cycle: " + lengthOfLoop);
        printt(head);
//        System.out.println(checkPalindrome(head));


//        segregateEvenOdd(head);
        removeNthNode(head);

    }

    private static void removeNthNode(Node head) {
int k=1;
        int length=0;
        Node temp=head;
        Node t=head;
        while (temp!=null){
            temp=temp.next;
            length++;
        }
        System.out.println(length);
        for (int i = 1; i < length-k; ) {
            t=t.next;
            i++;

        }
        System.out.println(t.data);
        t.next=t.next.next;
        printt(head);
    }

    private static void segregateEvenOdd(Node head) {
        Node temp = head;
        Node oddNode = null;
        Node evenNode = null;
        Node oddPrev = null,oddt=null, evenPrev = null,event=null;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenNode = new Node(temp.data);

                if(evenPrev==null){
                    evenPrev=event=evenNode;
                }else {
                event.next=evenNode;
                event=evenNode;}
            } else {
                 oddNode = new Node(temp.data);

                if(oddPrev==null){
                    oddPrev=oddt=oddNode;
                }else {
                oddt.next=oddNode;
                oddt=oddNode;}
            }
            temp = temp.next;

        }
        Node finalNode=evenNode;
//
        finalNode.next=oddPrev;
        printt(evenPrev);

    }

     static boolean checkPalindrome(Node head) {
        Node prev = null;
        Node fast = head;
        Node middle = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            middle = middle.next;
        }
        Node ahead = middle.next;
        while (middle != null) {
            middle.next = prev;
            prev = middle;
            middle = ahead;
            if (middle != null)
                ahead = middle.next;
        }
        while (prev != null) {
            if (prev.data != head.data) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }


        return true;
    }

    private static int findLoopLength(Node head, Node startNode) {
        if (head == null) return 0;
        Node temp = head;
        int fullLength = 0;
        int startLength = 0;
        Map<Node, Integer> nodes = new HashMap<>();
        boolean flag = false;
        while (temp != null) {
            if (temp == startNode) {
                if (flag) break;
                flag = true;
            }
            temp = temp.next;
            fullLength++;
        }

        System.out.println();
        while (head != startNode) {
            head = head.next;
            startLength++;
        }
        System.out.println(startLength + " " + fullLength);
        return fullLength - startLength;
    }

    private static Node findStartingPoint(Node head) {
        Node temp = head;
        Node intersect = detectCycle(head);
        while (temp.next != null) {
            temp = temp.next;
            if (intersect != null)
                intersect = intersect.next;
            if (temp == intersect) {
                System.out.println("start node : " + temp.data);
                return temp;
            }
        }

        return null;
    }

    private static void createCycleChain(Node head) {
        Node temp = head;
        Node t = head;
        for (int i = 0; i < 6; i++) {
            t = t.next;
        }
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = t;
    }

    private static Node detectCycle(Node head) {
        if (head == null) return null;
        Node thead = head;
        Node next = head;
        while (next != null && next.next != null) {
            next = next.next.next;
            thead = thead.next;
            if (next == thead) {
                ;
                return next;
            }
        }
        return null;
    }


}
