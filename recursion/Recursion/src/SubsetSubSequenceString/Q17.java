package SubsetSubSequenceString;

import java.util.ArrayList;
import java.util.List;

public class Q17 {
    public static void main(String[] args) {
        System.out.println(PhoneDial(" ", "12"));

    }
    static List<String> PhoneDial(String answer, String str) {
        List<String> outer = new ArrayList<>();
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(answer);
            return(list);
        }
        int digit = str.charAt(0) - '0';
//        ArrayList<String> list2 = new ArrayList<>();
        for( int i = (digit-1) *3 ; i < digit*3 ; i++) {
            char ch = (char) ('a' + i);
            outer.addAll(PhoneDial(answer+ch, str.substring(1)));
        }
            return outer;
    }
}
