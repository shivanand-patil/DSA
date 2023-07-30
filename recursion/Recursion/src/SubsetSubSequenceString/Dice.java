package SubsetSubSequenceString;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {

        System.out.println(DiceComb("", 4));
    }
    static List<String> DiceComb(String p, int target) {
        List<String> answer = new ArrayList<>();
        if(target == 0) {
            answer.add(p);
            return answer;
        }

        for( int i = 1 ; i <= 6 && i<= target ; i++  ) {
            answer.addAll( DiceComb(p + i, target -i));
        }
        return answer;

    }


}
