package introduction;

public class example {
    public static void main(String[] args) {
        print(6);
    }
    static void print(int n) {
        if(n==10) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        print(n+1);
    }
}
