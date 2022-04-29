package Arrays;
import java.util.*;
public class insertAnElement {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num=sc.nextInt();

        int pos =sc.nextInt();

        int newarr[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i <pos-1){
                newarr[i] = arr[i];
            }
            else if(i==pos-1){
                newarr[i] = num;
            }else{
                newarr[i] = arr[i-1];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
