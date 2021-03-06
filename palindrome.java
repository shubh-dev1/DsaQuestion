package BasicCode.strings;
import java.util.Scanner;
public class palindrome {

    // Java Code to  find the Nth number
// with exactly two bits set


        // Function to find the Nth number
// with exactly two bits set
        static void findNthNum(int N)
        {

            int bit_L = 1, last_num = 0;

            // Keep incrementing until
            // we reach the partition of 'N'
            // stored in bit_L
            while (bit_L * (bit_L + 1) / 2 < N) {
                last_num = last_num + bit_L;
                bit_L++;
            }

            // set the rightmost bit
            // based on bit_R
            int bit_R = N - last_num - 1;
            int Y = (1 << bit_L) + (1 << bit_R);
            int z = Math.abs(N-Y);
            System.out.print(z);
        }

        // Driver code
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int N= sc.nextInt();


            findNthNum(N);
        }
    }
