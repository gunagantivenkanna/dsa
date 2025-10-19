package queue.impl.stack;

import java.util.Arrays;

public class Stack2 {
    int capacity;
    int array[];
    int low=0;
    public Stack2(int size) {
        this.capacity=size;
        array=new int[capacity];
    }
    void printStack2(){
        System.out.println(Arrays.toString(array));
    }

    public int dequeue(Stack1 stack1) {
        if (isEmptyStack()) {
            while (!stack1.isEmptyStack()){
                enqueueStack(stack1.pop());
            }

            System.out.println("is empty!!");
        }
        return array[--low];
    }

    private void enqueueStack(int pop) {
        array[low++]=pop;
    }


    private boolean isEmptyStack() {
        return low==0;
    }
}
