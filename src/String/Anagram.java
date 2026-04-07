package String;

import java.util.Arrays;

public class Anagram {

    public boolean TwoStringAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();

        String s = "listen";
        String t = "silent";

        boolean result = obj.TwoStringAnagram(s, t);

        if (result) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are NOT Anagram");
        }
    }
}