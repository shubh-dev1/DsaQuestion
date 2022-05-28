package Arrays;
import java.util.*;
public class duplicateNumberUsingSorting {
    public static void main(String args[]){
        int arr[] = {1, 3, 4, 2, 2};
        Arrays.sort(arr);

        for(int i =0 ;i<arr.length;i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
