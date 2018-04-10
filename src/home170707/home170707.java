package home170707;

import homettd.Asserts;

public class home170707 {

    public static void main(String[] args) {

        String s = "   Hello ";
        String s2 = "Hello";  // trimmed
        String s3 = "  Hello";
        String s4 = "Hello  ";
        String s5 = "  He l l o  ";
        //             ^1     ^2
        String s6 = "";


        System.out.println(Asserts.assertEquals(trim(s6), ""));
        System.out.println(Asserts.assertEquals(trim(s2), s2));
        System.out.println(Asserts.assertEquals(trim(s4), s2));

        System.out.println("-------------------");
        System.out.println("Before: " + "'" + s3 + "'");
        System.out.println("After: " + "'" + trim(s3) + "'");
        System.out.println("-------------------");
        System.out.println("Before: " + "'" + s4 + "'");
        System.out.println("After: " + "'" + trim(s4) + "'");
        System.out.println("-------------------");
        System.out.println("Before: " + "'" + s5 + "'");
        System.out.println("After: " + "'" + trim(s5) + "'");
    }

    private static String trim(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        if (hasNoTrailingOrLeadingSpaces(s)) {
            return s;
        }

        int first = 0;
        int last = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                first = i;
                break;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                last = i;
                break;
            }
        }

        s = s.substring(first, last + 1);

        return s;
    }

    private static boolean hasNoTrailingOrLeadingSpaces(String s) {
        return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
    }

}
