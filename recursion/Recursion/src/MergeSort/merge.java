package MergeSort;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] nums = {1};
        nums = mergesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] mergesort(int[] nums) {
        if(nums.length == 1 || nums.length == 0) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeArrays(left, right);
    }

        private static int[] mergeArrays(int[] first, int[] second) {
        int[] mix = new int[first.length+ second.length];
        int i=0, j=0, k=0;
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        } return mix;

    }
}
