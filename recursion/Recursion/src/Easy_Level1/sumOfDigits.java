package Easy_Level1;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 112332;
        System.out.println(sum(n));
    }
    static int sum(int n) {
        if(n==0) {
            return 0;
        }
        int rem= n%10;
        n = n/10;
        return (rem + sum(n));
    }
}
