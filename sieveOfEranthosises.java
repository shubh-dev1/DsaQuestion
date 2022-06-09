package BasicCode.primeNumber;
import java.util.Scanner;
public class sieveOfEranthosises {
    static void sieve(int n){
        boolean prime [] = new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i] = true; // initially make all numbers are prime
        }
        for(int p=2;p*p <=n;p++){  // start from 2 and and goes upto the n
            if(prime[p] == true){        //
                for(int i =p*p;i<=n;i+=p){    // make all number false that is and divisor of the number

                    prime[i] =false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(prime[i] == true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sieveOfEranthosises ob = new sieveOfEranthosises();
        ob.sieve(n);
    }
}
