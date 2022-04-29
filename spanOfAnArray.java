package Arrays;
import java.util.*;
public class spanOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for maximum element
        int max = arr[0];
        // for minimum element
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];

            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("maximunm element is :" +max +"\n");
        System.out.print("minimum element is : " +min);
    }
}
