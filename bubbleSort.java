package BasicCode.sortingAlgo;
import java.util.Scanner;
public class bubbleSort {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        while(a-->0) {
//            int n = sc.nextInt();
//            int arr[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
        ///          0 1 2 3 4 5  temp=2
        int arr[] = {3,4,2,6,7,8}; // 2  4 5 6 8
int n = arr.length;//
        // bubble sort     4 3 2 1 8 6
        for(int i=0;i<n-1;i++){  // i =0  1 2 3 4       i =0 j =0 1 2 3 4
                                                         //i =1  j =0 1 2 3 4  o( n*n)
            for(int j=0;j<n-1-i;j++){
                if(arr[j+1]<arr[j]){   // arr [4+1] < arr[4]
                    int temp =arr[j+1];   // Big-O(1)
                    arr[j+1] = arr[j];
                    arr[j] =temp;
                }
            }
        }
            for(int l=0;l<n;l++){
                System.out.print(arr[l] +" ");
            }


        }
    }


