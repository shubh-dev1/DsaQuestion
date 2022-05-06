package strings;
import java.util.Scanner;
public class  reverseString {
    // program to reverse a string
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);// sc is the object here of Scanner class\
    String a = sc.next(); // taking input as a string
    for(int i=a.length()-1;i>=0;i--){
        System.out.print(a.charAt(i)+" ");
    }

    }
}
