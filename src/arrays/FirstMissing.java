package arrays;

import java.util.Arrays;

public class FirstMissing {
    public static void main(String[] args) {
        int[] nums = {1,2,0,-1,3,4,5,6,7,9};
        System.out.println(findFirstMissing(nums));
    }

    private static int findFirstMissing(int[] nums) {
        Arrays.sort(nums);
        int max = Arrays.stream(nums).max().getAsInt() + 1;
        int j = 0;
        for (int i = 1; i < max + 1; i++) {
            while (j < nums.length) {
                if (nums[j] < 1) {
                    ;j++;
                    continue;
                }
                System.out.println(i + " " + nums[j]);
                if (i != nums[j]) {
                    return i;
                } else {j++;break;}
            }
            System.out.println(i);
        }

        return max;
    }
}
