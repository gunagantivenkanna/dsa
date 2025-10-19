package stack.problems;


import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack();
        Stack<Integer> minStack = new Stack<>();
        pushElement(3, mainStack, minStack);
        pushElement(1, mainStack, minStack);
        pushElement(2, mainStack, minStack);
        pushElement(5, mainStack, minStack);
        pushElement(4, mainStack, minStack);
        System.out.println(mainStack.peek() + " " + minStack.peek());
        popElement(mainStack, minStack);
        int minElement = getMin(minStack);
        System.out.println(minElement);
        popElement(mainStack, minStack);
        popElement(mainStack, minStack);
        popElement(mainStack, minStack);
        System.out.println(mainStack.peek() + " " + minStack.peek());
        minElement = getMin(minStack);
        System.out.println(minElement);

    }

    private static int getMin(Stack<Integer> minStack) {
        return minStack.peek();
    }

    private static void popElement(Stack<Integer> mainStack, Stack<Integer> minStack) {
        int element = mainStack.pop();
        if (element == minStack.peek()) {
            minStack.pop();
        }
    }

    private static void pushElement(int element, Stack<Integer> mainStack, Stack<Integer> minStack) {

        mainStack.push(element);
        pushElementToMin(element, minStack);

    }

    private static void pushElementToMin(int element, Stack<Integer> minstack) {
        if (minstack.isEmpty() || element <=  minstack.peek()) {
            minstack.push(element);
        }
    }
}
