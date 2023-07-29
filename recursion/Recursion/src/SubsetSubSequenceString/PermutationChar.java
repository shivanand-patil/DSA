package SubsetSubSequenceString;

import java.util.ArrayList;

public class PermutationChar {
    public static void main(String[] args) {
        System.out.println(permcount("", "")) ;
    }
//    static void perm(String answer, String str) {
//        if(str.isEmpty()) {
//            System.out.println(answer);
//            return;
//        }
//        char ch = str.charAt(0);
//            for( int i = 0 ;  i <= answer.length(); i++) {
//                String first = answer.substring(0,i);
//                String second = answer.substring(i);
//                perm(first + ch + second, str.substring(1));
//            }
//        }

//    static ArrayList<String> perm(String answer, String str) {
//        if(str.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(answer);
//            return list;
//        }
//        char ch = str.charAt(0);
//        ArrayList<String> result = new ArrayList<>();
//        for( int i = 0 ;  i <= answer.length(); i++) {
//            String first = answer.substring(0,i);
//            String second = answer.substring(i);
//            result.addAll(perm(first + ch + second, str.substring(1)));
//        }
//        return result;

        static int permcount(String answer, String str) {
        if(str.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
            for( int i = 0 ;  i <= answer.length(); i++) {
                String first = answer.substring(0,i);
                String second = answer.substring(i);
                count = count + permcount(first + ch + second, str.substring(1));
            }
            return count;
        }




    }
