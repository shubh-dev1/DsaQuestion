package Arrays;
import java.util.Scanner;
public class binarysearch {
    static int isPresent(int arr[] ,int k){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(k == arr[mid]){
                return 1;
            }
            else{
                if(k > arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int arr[] = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
//            int result = isPresent(arr,k);
            System.out.println(isPresent(arr,k));
        }


    }
}
