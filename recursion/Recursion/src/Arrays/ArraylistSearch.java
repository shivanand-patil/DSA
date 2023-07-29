package Arrays;

import java.util.ArrayList;

public class ArraylistSearch {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 4,4,4,4,4, 5};
        int target = 99;
        int index = 0;
        ArrayList<Integer> list =new ArrayList<Integer>();
        System.out.println(search(arr, target, index, list));
    }

    static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return search(arr, target, index + 1, list);
    }
}
