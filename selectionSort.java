package BasicCode.sortingAlgo;
import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // taking number of text cases
        while (a-- > 0) {
            int n = sc.nextInt();  // taking size of the array
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  // taking array input
            }


            // outer loop
            for(int i=0;i<n-1;i++){
               int  min_index =i;
               // inner loop traversing in the array to find the min element in that index int the unsorted array
               for(int j=i+1;j<n;j++) {
                   if (arr[j] < arr[min_index]) {  // find the min element
                       min_index = j;  //


                   }
               }  // swap the elements
                   int temp = arr[min_index];
                   arr[min_index] = arr[i];
                   arr[i] = temp;
               } // print the sorted array
             for(int k=0;k<n;k++){
                System.out.print(arr[k] +" ");

            }

        }
    }
}

