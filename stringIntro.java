package strings;
import java.util.Scanner;
public class stringIntro {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int sum = Integer.parseInt(a) +Integer.parseInt(b);
        System.out.println(sum);
    }
}



