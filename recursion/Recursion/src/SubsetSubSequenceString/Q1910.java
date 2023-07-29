package SubsetSubSequenceString;

public class Q1910 {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }
    public static String removeOccurrences(String s, String part) {
        if(s.length() == 0) {
            return s;
        }
            if (s.startsWith(part)) {
                return removeOccurrences(s.substring(part.length()), part);
            } else
                return s.charAt(0) + removeOccurrences(s.substring(1), part);
        }
    }

