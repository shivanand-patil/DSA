package Bubblesort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,0,2,33,33445,54,545,45454,545};
        bubble(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int start, int end) {
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            bubble(arr, start + 1, end);
        } else {
            bubble(arr, 0, end - 1);
        }
    }

    }

