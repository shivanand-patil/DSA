package recursion;

public class factorial {
    public static void main(String[] args) {
        int ans = 1;
        System.out.println(fact(6, ans));
    }
    static int fact(int n, int ans) {
        if (n == 0 || n == 1) {
            return ans;
        }
        if(n < 0) {
            return -1;
        }

        return fact(n-1, ans*n);

     }
}
