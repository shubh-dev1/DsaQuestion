package Recursions;
import java.util.*;
public class namesNtimes {
     static void print(String str,int n){

        if(n>0){
            System.out.println(str);
            print(str,n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        print(str,n);
    }
}
