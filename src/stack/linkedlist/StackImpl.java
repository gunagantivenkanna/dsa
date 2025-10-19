package stack.linkedlist;

public class StackImpl {
    public static void main(String[] args) {
Stack stack = null;
stack=push(stack,20);
printStack(stack);
        System.out.println(pop(stack));
        printStack(stack);
        System.out.println(peek(stack));
    }

    private static int peek(Stack stack) {
        if(stack==null){
            return -1;
        }
        while (stack.next!=null){
            stack=stack.next;
        }
        return stack.data;
    }

    private static int pop(Stack stack) {
        Stack temp=stack;

        if(!isEmptyy(stack)){
            while (temp.next!=null){
                temp=temp.next;
            }
            while (stack.next!=null&&stack.next.next!=null){
                stack=stack.next;
            }
            int data=temp.data;
            stack.next=null;
            return data;
        }
        return -1;
    }

    private static boolean isEmptyy(Stack stack) {
        return stack==null;
    }

    private static void printStack(Stack stack) {
        Stack st=stack;
        while(st!=null){
            System.out.print(st.data+"-");
            st=st.next;
        }
        System.out.println();
    }

    private static Stack push(Stack stack,int i) {
        Stack newStack=new Stack(i);
        if(stack==null){
            stack=newStack;
            return stack;
        }
        Stack temp=stack;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newStack;
        return stack;
    }
}
