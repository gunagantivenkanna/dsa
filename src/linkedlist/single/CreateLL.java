package linkedlist.single;

import static linkedlist.single.SingleLinkedListImpl.insertAtEnd;

public class CreateLL {
     static Node createLL(int numbers) {
        Node head1 = null;
         for (int i = 0; i < numbers; i++) {
             head1 = insertAtEnd(head1, i+1);

         }


        return head1;
    }
}
