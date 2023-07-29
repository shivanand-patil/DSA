package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 4, 5};
        int target = -1;
        int index = 0;
        System.out.println(search(arr, target, index));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }
}
