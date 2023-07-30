package SubsetSubSequenceString;

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            int res = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            for (int j = 0; j < n - 1; j++) { // Changed the loop condition to "n - 1"
                res += Math.abs(arr[j] - arr[j + 1]) - 1; // Calculate the difference and subtract 1
            }
            System.out.println(res);
        }
    }
}
