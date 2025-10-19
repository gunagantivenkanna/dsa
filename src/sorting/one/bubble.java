package sorting.one;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int array[] = {13,46,24,52,20,9};
//        bubbleSort(array);
//        selectionsort(array);
insertionSort(array);


    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i <array.length-1 ; i++) {
            int j=i+1;

             while(j>0 &&array[j]<array[j-1]){
                int temp=array[j];
                array[j]=array[j-1]
                        ;
                array[j-1]=temp;
                j--;

        }
        }
        System.out.println(Arrays.toString(array));

    }

    private static void selectionsort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
            System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                int  temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
            System.out.println(Arrays.toString(array));
}}
