package priorityqueue;

public class CheckMinHeap {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 12};
        System.out.println(isMinHeap(arr));
    }

    private static boolean isMinHeap(int[] arr) {
        int parent = 0;
        int i = 0;
        while (i < arr.length) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < arr.length  && arr[i] > arr[left] ) {
                return false;
            }
            if(right < arr.length && arr[i] > arr[right]){
                return false;
            }

            i++;
        }
        return true;
    }
}
