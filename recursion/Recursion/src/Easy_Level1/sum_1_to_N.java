package Easy_Level1;

public class sum_1_to_N {
    public static void main(String[] args) {
        System.out.println(fact(11));
    }
    static int fact(int n) {
        if(n == 1) {
            return 1;
        } else if(n == 0) {
            return 0;
        }
        return (n + fact(n-1));


    }
}
