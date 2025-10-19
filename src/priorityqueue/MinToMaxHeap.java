package priorityqueue;

import java.util.Arrays;

public class MinToMaxHeap {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 12};
        convertMintoMax(arr);
        System.out.println(Arrays.toString(arr));
    }

   private static void convertMintoMax(int[] arr) {
    int lastNonLeaf = (arr.length - 2) / 2;

    while (lastNonLeaf >= 0) {
        int i = lastNonLeaf;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            // Find largest among parent and children
            if (left < arr.length && arr[left] > arr[largest])
                largest = left;
            if (right < arr.length && arr[right] > arr[largest])
                largest = right;

            // No swap needed, heap property satisfied
            if (largest == i)
                break;

            // Swap with largest child
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Move down to continue bubbling
            i = largest;
        System.out.println("IAST  "+lastNonLeaf+" "+Arrays.toString(arr));
        }
        lastNonLeaf--;
    }
}



}
