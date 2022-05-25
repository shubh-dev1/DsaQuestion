package BasicCode.sortingAlgo;
import java.util.Scanner;
public class insertionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){     // for n loop is running
            int a = sc.nextInt();   // number of element in the array
            int arr[] = new int [a];
            for(int i=0;i<a;i++){
                arr[i] = sc.nextInt(); // array store in the memory on 0 index based
            }
            for(int j=1;j<a;j++){   // set element in the temp
                int key = arr[j];
                 int k=j-1;

                 while(k >=0 && arr[k] >key){
                     arr[k+1] = arr[k];
                     k--;
                 }
                 arr[k+1] = key;
            }
            for(int l=0;l<a;l++){
                System.out.print(arr[l] +" ");
            }
            System.out.println();
        }
    }
}
