package Arrays;

public class checkSort {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,5};
        int start = 0;
        System.out.println(check(arr, start));
    }
    static boolean check(int[] arr, int start) {
        if(start == arr.length-1 ) {
            return true;
        }
        return arr[start] < arr[start+1] && check(arr, start+1);
    }
}
