package queue.impl.array;

public class QueueImplementationArray {
    public static void main(String[] args) {
        System.out.println("QueueImplementationArray");
        QueueArray queueArray = new QueueArray(5);
        queueArray.printQueue();
        queueArray.engueue(10);
        queueArray.engueue(20);
        queueArray.engueue(30);
        queueArray.engueue(40);
        queueArray.engueue(50);
        queueArray.printQueue();
        queueArray.dequeue();
        queueArray.printQueue();

    }
}
