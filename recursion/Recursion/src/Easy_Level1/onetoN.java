package Easy_Level1;

import java.util.Scanner;

// print N to 1 using recursion
public class onetoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int start = 1;
        n = input.nextInt();
        print(n, start);
    }
    static void print(int n, int start) {
        if(n==start) {
            System.out.println(start);
            return;
        }
        System.out.print(start + " ");
        print(n,start+1);
    }
}
