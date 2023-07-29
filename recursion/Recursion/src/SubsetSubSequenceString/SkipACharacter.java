package SubsetSubSequenceString;

public class SkipACharacter {
       public static void main(String[] args) {
//        skip("", "shivanand");
        System.out.println(check("sushmita"));
    }
//    static void skip (String ans, String str) {
//        if(str.isEmpty()) {
//            System.out.println(ans);
//            return;
//        }
//        char ch = str.charAt(0);
//        if(ch == 'a' || ch=='i') {
//            skip(ans, str.substring(1));
//        } else {
//            skip(ans+ch, str.substring(1));
//        }
//    }

    static String check(String str) {
        if(str.length() == 0 ) {
            return str;
        }
        char ch = str.charAt(0);
        if(ch == 'a') {
            return check(str.substring(1));
        } else
            return ch+ check(str.substring(1));
    }
}
