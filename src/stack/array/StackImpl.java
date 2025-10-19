package stack.array;

public class StackImpl {
    public static void main(String[] args) {
        System.out.println("Stack implementation");
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);

        stack.printItems();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        stack.push(10);
        stack.printItems();
        System.out.println(stack.peek());
        stack.printItems();
    }
}
