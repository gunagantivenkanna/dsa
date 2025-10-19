package queue.impl.array;

public class QueueArray {
    int capacity;
    int array[];
    int front = 0;
    int rear = 0;

    public QueueArray(int data) {
        capacity = data;
        array = new int[capacity];
    }

    void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.print(array[i] + " ");
        }
//        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    void engueue(int data) {
        array[rear++] = data;
    }

    public void dequeue() {
        front++;
        shifElements();
    }

    private void shifElements() {
        int i = front;
        int cnt = 0;
        while ( i <= rear - 1) {
            array[i - 1] =  array[i];
            System.out.println("shift elements");
            cnt++;
            i++;
        }
        front = 0;
        rear = cnt ;
    }
}
