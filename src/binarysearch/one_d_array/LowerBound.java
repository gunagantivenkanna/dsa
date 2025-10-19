package binarysearch.one_d_array;

public class LowerBound {
    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4};
        int ar[]=new int[2];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
//        for (int i = 0; i < ar.length; i++) {
//            System.out.println(ar[i]);
//        }
//        System.out.println(a);
//        int target = 3;
//     int ans=   findLowerBound(input, 0, input.length - 1, target);
//        System.out.println(ans);
    }

    private static int findLowerBound(int[] input, int low, int high, int target) {

        int mid = (low + high) / 2+1;
        if(low>high) return -1;
        if (target > input[mid]) {
             findLowerBound(input, mid + 1, high, target);
        }
        else if(target<input[mid]){
             findLowerBound(input,0,mid,target);

        }
        else {
            if(target==input[mid]){
                return mid;
            }
        }
        return -1;
    }
}
