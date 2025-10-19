package queue.impl.stack;

import java.util.Arrays;

public class Stack1 {
    int array[];
    int capacity;
    int low = 0;

    public Stack1(int size) {
        this.capacity = size;
        array = new int[size];

    }

    void printStack1() {
        System.out.println(Arrays.toString(array));
    }

    public void enqueue(int element) {
        array[low++] = element;
    }

    public int pop() {
        if (isEmptyStack()) {
            System.out.println("empty");
            return -1;
        }
        return array[--low];
    }

     boolean isEmptyStack() {
        return low
                == 0;
    }
     int length() {
         System.out.println("length:"+low);
        return low;
    }
}
