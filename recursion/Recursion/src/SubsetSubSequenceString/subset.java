package SubsetSubSequenceString;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
       // subsets("", "abc");
//        System.out.println(subsetsret("", "abc"));
        System.out.println(subsetsretAscii("", "abc"));

    }
    static void subsets(String answer, String str) {
        if(str.length() == 0) {
            System.out.println(answer);
            return;
        }
        char ch = str.charAt(0);
        subsets(answer + ch, str.substring(1));
        subsets(answer, str.substring(1));
    }

    static ArrayList<String> subsetsret(String answer, String str) {
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(answer);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsetsret(answer + ch, str.substring(1));
        ArrayList<String> right =  subsetsret(answer, str.substring(1));

        left.addAll(right);
        return left;

    }

//    static ArrayList<Integer> subsetsretInt(int[] answer, int[] arr) {
//        if(arr.length == 0) {
//            ArrayList<Integer> list = new ArrayList<>();
//            list.add(answer);
//            return list;
//        }
//        char ch = str.charAt(0);
//        ArrayList<String> left = subsetsretInt(answer + ch, str.substring(1));
//        ArrayList<String> right =  subsetsretInt(answer, str.substring(1));
//
//        left.addAll(right);
//        return left;
//
//    }

    static ArrayList<String> subsetsretAscii(String answer, String str) {
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(answer);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsetsretAscii(answer + ch, str.substring(1));
        ArrayList<String> right =  subsetsretAscii(answer, str.substring(1));
        ArrayList<String> middle = subsetsretAscii((answer + (ch+0)), str.substring(1));
        left.addAll(right);
        left.addAll(middle);
        return left;

    }
}

