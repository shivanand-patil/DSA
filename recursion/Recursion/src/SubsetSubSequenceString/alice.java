package SubsetSubSequenceString;

import java.util.Scanner;

public class alice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // N, number of distinct solutions needed
            int t1 = scanner.nextInt(); // Time taken by Bob to write one solution
            int t2 = scanner.nextInt(); // Time taken by Alice to write one solution

            // Find the moment when the last solution is finished
            int maxTime = Math.max(t1 * n, t2 * n);

            // Calculate the total number of written solutions by Bob and Alice
            int totalSolutionsByBob = maxTime / t1;
            int totalSolutionsByAlice = maxTime / t2;

            // Calculate the total number of written solutions
            int totalSolutions = Math.min(n, totalSolutionsByBob + totalSolutionsByAlice);

            // Print the results for this test case
            System.out.println(totalSolutions + " " + maxTime);
        }

        scanner.close();
    }
}
