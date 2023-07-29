package Easy_Level1;

public class palindrome {
    public static void main(String[] args) {
        int n = 101;
        int answer = palindromeFunction(n);
        System.out.println(answer);
        if(answer == n) {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
    static int palindromeFunction(int n) {
        if(n%10 == n) {
            return n;
        }
        System.out.print(n%10);
        return  palindromeFunction(n/10);
    }
}
