package strings;
import java.util.*;
public class largeSum {
    public static String findSum(String str1, String str2){
        // swapping if str1 is greater than the str2
        if(str1.length() >str2.length()){
            String temp = str1;
            str2 = str1;
            str2 =str1;

        }
        String str ="";  // empty string to store the char after all operation
        int n1 = str1.length();   // length of the smallest string or number
        int n2 = str2.length();   // length of the greatest string or number
        int diff = n2 -n1;         // diff is used to get the position of the larger string or the number

        int carry =0;    // intial carry is zero
          // sum the didgit then has equal index of small string or number
        for(int i=n1-1;i>=0;i--){
            int sum = ((int)(str1.charAt(i) - '0') + (int)(str2.charAt(i+diff)-'0') +carry);

            str += (char)(sum%10 +'0');  // passing the char to the char string
            carry =sum/10;     // finding the carry

        }
        // add remaining digit of the str2
        for(int i =n2-n1-1;i>=0;i--){
            int sum = ((int)(str2.charAt(i) -'0')+carry);
            str +=(char) (sum%10 + '0');

            carry =sum/10;

        }
        if(carry>0){  // adding extra carry if there is
            str += (char)(carry +'0');
        }
        return new StringBuilder(str).reverse().toString();  // reverse the string
    }
// main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); // string input 1
        String str2 = sc.next();  // string input 2
        System.out.println(findSum(str1,str2));  // calling findSum function
    }
}
