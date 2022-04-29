package Arrays;
import java.util.*;
public class sortAnArrayWithoutChangingPositionofNegativeNumbers {
    static void sortArray(int arr[] ,int n){
        Vector<Integer> ans = new Vector<>();
        for(int i=0;i<n;i++) {
            if (arr[i] >= 0) {
                ans.add(arr[i]);
            }
        }
        Collections.sort(ans);
        int j=0;
        for(int i=0;i<n;i++) {
            if (arr[i] >= 0) {
                arr[i] = ans.get(j);
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");

        }
    }

    public static void main(String[] args) {
        int arr[] = {2,-6,-3,8,4,1};
        int n = arr.length;
        sortArray(arr,n);
    }
}
