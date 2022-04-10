package Arrays;
import java.util.*;
public class firstRepeatingIntegerOptimalSol {
    public static void main(String[] args) {
        int arr[] = {10,1,2,4,3,5,6};
        HashSet<Integer> set = new HashSet<>();
        int min =-1;
        for(int i=arr.length-1;i>=0;i--){
            if(set.contains(arr[i])){
                min =i;
            }else{
                set.add(arr[i]);
            }
        }
        if(min != -1){
            System.out.println(arr[min]+" ");
        }
        else{
            System.out.println("There is no such element");
        }
    }
}
