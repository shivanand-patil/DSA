package Arrays;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        int target =-1;
        int start = 0;
        int end = arr.length -1;
        System.out.println(search(arr, target, start, end));
    }
    static int search(int[] arr, int target, int start, int end) {
        int mid = start+ (end - start) /2;
        if(start> end) {
            return -1;
        }
        if(target == arr[mid]) {
            return mid;
        }
        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid-1);
            }
        }
        if(arr[mid] <= arr[end]) {
            if(target >= arr[mid] && target <= arr[end]) {
                return search(arr, target, mid+1, end);
            }
        }  return search(arr, target, start, mid-1);
    }
}
