package queue.impl.circularaary;

public class QueueC {
    private int capacity;
    private int[] array;
    private int front = 0;   // points to the first element
    private int rear = -1;   // points to the last element
    private int size = 0;    // number of elements

    public QueueC(int size) {
        this.capacity = size;
        this.array = new int[capacity];
    }

    // Add element
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot insert " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = value;
        size++;
    }

    // Remove element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;
        }
        int value = array[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }
}
