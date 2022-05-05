package BasicCode.strings;

public class removeSpecialChar {
    public static void main(String[] args) {
        String str  =" j@ava%s!st*ar";
        String s = str.replaceAll("[^a-zA-z0-9]" ,"");
        System.out.print(s);
    }
}
