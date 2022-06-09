package BasicCode.twoSubsetXor;
import java.util.Scanner;
public class binaryToDeimal {
    static int todeci(int n){
        int decimal = 0;
        int a=0;
        while(true){
            if(n==0){
             break;
            }
            else{
                int temp =n%10;
                decimal+=  temp*Math.pow(2,a);
                n = n/10;
                a++;
            }

    }
          return decimal;
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    todeci(n);
        System.out.println(todeci(n));
}
}
