package Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target=88;
        int start = 0;
        int end = arr.length-1;
        System.out.println(binsearch(arr, target, start,end));
    }
    static int binsearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) /2;
        if(start > end) {
            return -1;
        }
        if(target ==  arr[mid]) {
            return mid;
        } else if (target > arr[mid] ) {
            return binsearch(arr, target, (mid+1), end);
        }
        return binsearch(arr, target, start, (mid-1));
    }
}
