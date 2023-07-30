package SubsetSubSequenceString;

public class Q1155 {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(1, 6, 3));
    }
    public static int numRollsToTarget(int n, int k, int target) {
        if(target == 0) {
            return 0;
        }
        int count = 0 ;

        for( int  i = 1 ; i <= n ; i++ ) {
            for( int j = 1 ; j <= k && j <= target ; j++) {
                count = count  + numRollsToTarget(n , k , target - j);
            }
        } return count;
    }
}
