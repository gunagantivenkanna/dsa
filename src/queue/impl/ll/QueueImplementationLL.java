package queue.impl.ll;

public class QueueImplementationLL {
    public static void main(String[] args) {
        Que que = null;
        ;
        que = enque(que, 20);
        Que rear = enque(que, 10);
        enque(rear,30);
        printQ(que);
        que=deQue(que);
        printQ(que);

    }

    private static Que deQue(Que que) {
        if(que!=null){
            que=que.rear;
            return que;
        }
        return null;
    }

    private static void printQ(Que queue) {
        Que temp = queue;
        while (temp != null) {
            System.out.print(temp.data + "-");
            temp = temp.rear;
        }
        System.out.println();
    }

    private static Que enque(Que queue, int i) {
        Que newQue = new Que(i);
        Que temp = queue;
        if (temp == null) {
            temp = newQue;
            return temp;
        }
        temp.rear = newQue;
        temp = newQue;
        return temp;
    }
}
