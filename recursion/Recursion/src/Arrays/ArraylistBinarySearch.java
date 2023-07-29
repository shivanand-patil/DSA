package Arrays;

import java.util.ArrayList;

public class ArraylistBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 5,5,5,5,5,5,5,-5};
        int target=5;
        int start = 0;
        int end = arr.length-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(binsearch(arr, target, start,end, list));
    }
    static ArrayList<Integer> binsearch(int[] arr, int target, int start, int end, ArrayList<Integer> list ) {
        int mid = start + (end - start) /2;
        if(start > end) {
            return list;
        }
        if(target ==  arr[mid]) {
            list.add(mid);
        } else if (target > arr[mid] ) {
            return binsearch(arr, target, (mid+1), end, list);
        }
        return binsearch(arr, target, start, (mid-1), list);
    }
}
