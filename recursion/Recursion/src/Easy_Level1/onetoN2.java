package Easy_Level1;

public class onetoN2 {
    public static void main(String[] args) {
        onetoN(5);
    }
    static void onetoN(int n) {
        if(n==0) {
            return;
        }
        System.out.print(n+ " ");
        onetoN(n-1);
        System.out.print(n +" ");


    }
}
