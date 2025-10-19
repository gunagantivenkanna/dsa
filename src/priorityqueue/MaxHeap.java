package priorityqueue;

import java.util.Arrays;

public class MaxHeap {
    static int i = 0;
    static int prev;

    public static void main(String[] args) {
        System.out.println("Implement Max heap");
        int array[] = new int[40];
        insertElement(array, 10);
        System.out.println(Arrays.toString(array));
        insertElement(array, 20);
        System.out.println(Arrays.toString(array));
        insertElement(array, 12);
        System.out.println(Arrays.toString(array));
        insertElement(array, 2);
        System.out.println(Arrays.toString(array));
        deleteElement(array);
        System.out.println(Arrays.toString(Arrays.copyOf(array, 4)));
    }

    private static void deleteElement(int[] array) {
        int size = 4;
        array[0] = array[size - 1];
        size--;
        System.out.println(Arrays.toString(array));
        int i = 0;
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int t = i;
            if (left < size && array[i] < array[left])
                i = left;
            if (right < size && array[i] < array[right]) {
                i = right;
            }
            if (t == i) break;
            int temp = array[t];
            array[t] = array[i];
            array[i] = temp;
        }

    }

    private static void insertElement(int[] array, int element) {
        System.out.println(array[i]);
        array[i] = element;
        int current = i;
        int parent = (current - 1) / 2;


        while (current > 0 && array[current] > array[parent]) {
            int temp = array[current];
            array[current] = array[parent];
            array[parent] = temp;
            current = parent;
            parent = (current - 1) / 2;
        }
        i++;
    }
}
