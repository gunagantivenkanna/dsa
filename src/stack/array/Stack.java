package stack.array;

public class Stack {
    int []stack;
    int top=-1;
    Stack(int size){

        this.top=top;
        stack=new int[size];
    }

    public void push(int i) {
        stack[++top]=i;
    }

    public void printItems() {
        for (int i = 0; i <=top ; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public int  pop() {
        if(!isEmpty()){
            return stack[top--];
        }
        return -1;
    }

    private  boolean isEmpty() {
        return top==-1;

    }

    public int peek() {
        if(!isEmpty()){
            return stack[top];
        }
        return -1;
    }

}
