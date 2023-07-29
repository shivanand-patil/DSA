package Easy_Level1;

public class countZeroes {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        System.out.println(counter(n, count));
    }
    static int counter(int n, int count) {
        if(n==0) {
            return count;
        }
        if(n%10 == 0) {
            return counter(n / 10, count+1);
        }
        return counter(n/10, count);
    }
}

