package SubsetSubSequenceString;

public class deletecharacter {
    public static void main(String[] args) {
        String str = "hpllo";
        str = check(str);
        System.out.println(str);

    }
    static String check(String str) {
        if(str.length() == 0) {
            return str;
        }
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == 'a') {
                return "";
            }
        } return check(str);
    }
}
