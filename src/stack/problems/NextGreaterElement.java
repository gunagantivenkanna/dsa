package stack.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {3, 1, 2, 4};
//        int res[] = findNextGreaterElement(array, stack);
//        System.out.println(Arrays.toString(res));
        int r[] = findNextGreaterElementWithArrayList(array, stack);
        System.out.println(Arrays.toString(r));
    }

    private static int[] findNextGreaterElement(int[] array, Stack<Integer> stack) {
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int greater;
            while (!stack.isEmpty() && stack.peek() <= array[i]) stack.pop();
            if (stack.isEmpty()) {
                greater = -1;
            } else {
                greater = stack.peek();
            }
            stack.push(array[i]);

            result[i] = greater;
        }
        return result;
    }

    private static int[] findNextGreaterElementWithArrayList(int[] array, Stack<Integer> stack) {
        int result[] = new int[array.length];
        List<Integer> list = new ArrayList<>();
        int y = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            int x = list.size()-1;
            int greater;
            while (!list.isEmpty() && array[i] >= list.get(x)) {
                x--;
            }
            if (list.isEmpty()) {
                greater = -1;
            } else {
                greater = list.get(x);
            }
            list.add(array[i]);
            y++;
            result[i] = greater;
        }
        return result;
    }
}
