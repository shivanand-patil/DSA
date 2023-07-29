package Easy_Level1;

import java.util.Scanner;

// print N to 1 using recursion
public class Nto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        print(n);
    }
    static void print(int n) {
        if(n==0) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print(n-1);



    }
}
