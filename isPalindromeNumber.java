package strings;
import java.util.*;
public class isPalindromeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x<0){
            System.out.println("not a palindrome number");
        }
        int reverse =0;
        int number = x;
        while(number>0){
            reverse = reverse *10 + number%10;
            number/=10;
        }
      if(reverse == x){
          System.out.println("palindrome number");
    }else{
          System.out.println("not a palindrome");
      }


    }
}
