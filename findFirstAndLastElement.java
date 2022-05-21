package BasicCode.searching;
import java.util.Scanner;
public class findFirstAndLastElement {
    static void find(int arr[],int x){

        int n = arr.length;
        int first = -1;
        int last= -1;
        for(int i=0;i<n;i++){
            if(arr[i] !=x){
                continue;
            }
            if(first == -1){
                first = i;
            }
            last =i;
        }
        System.out.println(first +" " +last);

    }

    public static void main(String[] args) {
        int arr[]= { 1,2,3,2,2,3,5,5,6,2,8,8};
        int x = 8;

        find(arr,x);
    }
}
