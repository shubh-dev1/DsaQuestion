package BasicCode.MostCommonQuestion;

import java.util.Scanner;

public class isprimeBruteForce {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();

            int count =0;
            for (int i = 1; i <=a;i++ ){
                if((a % i) == 0){
                    count++;
                }
            }
            if(count ==2){
                System.out.println("Number is Prime");
            }else{
                System.out.println("Number is not prime");
            }

        }
    }
}
