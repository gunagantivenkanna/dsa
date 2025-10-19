package stack.usingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationQueue {
    Queue<Integer> queue=new LinkedList<>();

    public static void main(String[] args) {
        Queue<Integer> mainQueue = new LinkedList<>();

        mainQueue = enqueue(1, mainQueue);
        mainQueue = enqueue(2, mainQueue);
        mainQueue = enqueue(3, mainQueue);
        mainQueue = enqueue(4, mainQueue);
        pop(mainQueue);
    }

    private static void pop(Queue<Integer> mainQueue) {
            System.out.println(mainQueue.remove());
    }

    private static Queue<Integer> enqueue(int i, Queue<Integer> mainQueue) {
        Queue<Integer> temp = new LinkedList<>();
        temp.add(i);
        while (!mainQueue.isEmpty()) {
            temp.add(mainQueue.remove());
        }
        mainQueue = temp;
        return mainQueue;
    }
     public int ping(int t) {
        int cnt=0;
        if(t==0){
            queue.add(null);
            return 1;
        }
        queue.add(t);
        while(cnt<queue.size()){
            if(t-3000>queue.element()){
                queue.remove();
            }
            cnt++;
        }
        return queue.size();

    }
}
