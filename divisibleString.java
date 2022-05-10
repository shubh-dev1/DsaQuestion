package strings;
import java.util.Scanner;
public class divisibleString {
    public static void main(String[] args) {
        //Given a number N, find out whether it is divisible by 3.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String n = sc.next();
        for(int i=0;i<n.length();i++){
            sum += n.charAt(i) -'0';
        }
        if(sum%3==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
