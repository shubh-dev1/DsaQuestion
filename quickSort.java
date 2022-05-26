package BasicCode.sortingAlgo;
import java.util.Scanner;
public class quickSort {
     static int partition(int arr[] ,int start,int end){
         int pivot = arr[end];
         int i= start-1;
         for(int j=start;j<=end;j++){
             if(arr[j] <pivot){
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
         int temp = arr[i+1];
         arr[i+1] = arr[end];
         arr[end] = temp;
         return (i+1);

     }
     static void quick(int arr[] ,int start,int end){
         if(start<end){
             int p = partition(arr,start,end);
             quick(arr,start,p-1);
             quick(arr,p+1,end);
         }

    }

    static void printarr(int arr[],int n){
         for(int i=0;i<n;i++){
             System.out.print(arr[i] +" ");
         }
    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1,0};
        int a = arr.length;
        quick(arr,0,a-1);
        printarr(arr,a);
    }
}
