package sorting.two;

import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
                int array[] = {13,46,24,52,20,9};
bubble(array,0);
    }

    private static void bubble(int[] array,int i) {
        if(i>array.length-2) return;
        for (int j = 0; j < array.length-i-1; j++) {
              if(array[j]>array[j+1]){
        int temp=array[j];
        array[j]=array[j+1];
        array[j+1]=temp;}
        }

        System.out.println(Arrays.toString(array));
        bubble(array,++i);
    }
}
