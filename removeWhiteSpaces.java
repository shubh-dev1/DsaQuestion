package BasicCode.strings;

public class removeWhiteSpaces
{
    public static void main(String[] args) {
        String s1 = " ja va  s ta r  ";
        String s2 = s1.replaceAll("\\s" ,"");// \\s unicode value for white space
        System.out.print(s2);
    }

}
