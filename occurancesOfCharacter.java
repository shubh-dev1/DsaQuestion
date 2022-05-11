package BasicCode.strings;

public class occurancesOfCharacter {
    public static void main(String[] args) {
        String str = "hello world";
        int intialLength = str.length();
        String str1 ="l";
        str = str.replace(str1,"");
        int finallength = str.length();

        System.out.println(str1 +" " +( intialLength- finallength));
    }
}
