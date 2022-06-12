package BasicCode.twoPointers;
import java.util.Scanner;
public class maxSumSubArray {
    public static void main(String args[]) {
        // method 1 brute force tc = O(N*N)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int min_l = n+1;
        for(int start =0;start<n;start++){
            int curr_sum = arr[start];
            if(arr[start] >=x){
                System.out.println("1");
            }
            for(int end =start+1;end<n;end++){
                curr_sum += arr[end];
                if(curr_sum>=x && (end -start+1)<(min_l)){
                    min_l =(end-start+1);
                }
            }
        }
        System.out.println(min_l);


    }
}
