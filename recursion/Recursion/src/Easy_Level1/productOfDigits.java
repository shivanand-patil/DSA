package Easy_Level1;

public class productOfDigits {
    public static void main(String[] args) {
        int n = 1128;
        System.out.println(product(n));
    }
    static int product(int n) {
        if( n%10 == n) {
            return n;
        }
        int rem = n%10;
        n=n/10;
        return (rem) * product(n);
    }
}
