package queue.impl.circularaary;

public class QueueImplementationCircularArray {

    public static void main(String[] args) {
        QueueC queueC = new QueueC(5);
        queueC.printQueue();
        queueC.enqueue(10);
        queueC.enqueue(20);
        queueC.enqueue(30);
        queueC.enqueue(40);
        queueC.enqueue(50);
        queueC.printQueue();
        queueC.dequeue();
        queueC.printQueue();
        queueC.enqueue(60);
        queueC.printQueue();
    }
}
