package BasicCode.sortingAlgo;
import java.util.Scanner;
public class mergeSorting {
    static void merge(int arr[],int start,int mid,int end){
        int n1 = mid-start+1;
        int n2= end-mid;

        // temp array
        int left[] = new int[n1];
        int right[] = new int [n2];

        //storing the value in temp array

        for(int i=0;i<n1;i++) {
            left[i] = arr[start + i];
            for (int j = 0; j < n2; j++) {
                right[j] = arr[mid + 1 + j];
            }
        }
          int i=0;
            int j=0;
            int k = start;

            while(i<n1 && j<n2){
                if (left[i] <= right[j]){ // if element in the keft array is greater put  it into the  aar[k]
                    arr[k] = left[i];
                    i++;
                }
                else{
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k] = right[j];
                j++;
                k++;
            }
    }


     //sort the array
    static void sort(int arr[] ,int start,int end) {
        if (start < end) {
            int mid = (start + end)/ 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    // print the array after sorting
    static void printArray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }


    // main code
    public static void main(String args []){
        int arr [] = {10,9,8,7,6,2,5};
        sort(arr,0,arr.length -1);

        printArray(arr);

}

}












