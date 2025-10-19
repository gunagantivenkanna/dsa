package sorting.two;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {3, 2, 8, 5, 1, 4, 23};
//        mergeSort(array, 0, array.length);

        copyArray(array);

    }

    private static void copyArray(int[] array) {
        int temp[]=new int[array.length];
        for (int i = 0; i <array.length-1 ; i++) {
            temp[i]=array[1+i];
        }
        System.out.println(Arrays.toString(temp));
    }

    private static void mergeSort(int[] array, int start, int end) {
        int mid = (start + end) / 2;

        if (start>=end) return;
        mergeSort(array, 0, mid);
        mergeSort(array,mid+1,end);
        System.out.println(array[mid]);

    }
}
