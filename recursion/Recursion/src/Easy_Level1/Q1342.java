package Easy_Level1;

public class Q1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));

    }
    static int numberOfSteps(int num) {
        return check(num, 0);
    }

    static int check(int n, int count) {
        if(n == 0) {
            return count;
        }
        if(n % 2 == 0) {
            return check(n/2, count+1);

        }
            return check(n-1, count+1);

    }
}
