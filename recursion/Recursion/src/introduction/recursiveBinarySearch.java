package introduction;

public class recursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 0;
        System.out.println(recursiveBinaryS(arr,target, 0, arr.length-1));
    }
    static int recursiveBinaryS(int[] arr, int target , int start, int end) {
        int mid = start + (end - start) / 2;
        if(start > end) {
            return -1;
        }

        if( target == arr[mid]) {
            return mid;
        } else
        if( target < arr[mid]) {
            return recursiveBinaryS(arr, target, start, mid-1);
        } else

            return recursiveBinaryS(arr, target, mid+1, end);

    }
}
