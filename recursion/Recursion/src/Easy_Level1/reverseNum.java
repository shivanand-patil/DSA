package Easy_Level1;

public class reverseNum {
    public static void main(String[] args) {
        int n= -1043530;
        System.out.println(reverse(n));
    }
    static int reverse(int n) {
        if(n%10 == n) {
            return n;
        }
        System.out.print(n%10);
        return reverse(n/10);
    }
}
