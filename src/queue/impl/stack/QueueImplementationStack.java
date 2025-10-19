package queue.impl.stack;

import java.util.Stack;

public class QueueImplementationStack {
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1(5);
        Stack2 stack2 = new Stack2(5);
        stack1.printStack1();
        stack2.printStack2();
        stack1.enqueue(1);
        stack1.enqueue(2);
//        stack1.enqueue(3);
        stack1.enqueue(4);
        stack1.enqueue(5);
        System.out.println(stack2.dequeue(stack1));
        System.out.println(stack2.dequeue(stack1));
        stack1.printStack1();
        stack2.printStack2();
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());

    }
}
