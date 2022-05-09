package BasicCode.strings;

import org.w3c.dom.ls.LSOutput;

public class pangramStrind {
    static boolean isPanagram(String s, int n) {
        if (n < 26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;


    }


    public static void main(String[] args) {


        String s = "abcefghijklmnopqrstuvwxyzdz";
        int n = s.length();
        System.out.println(isPanagram(s, n));
    }
}
