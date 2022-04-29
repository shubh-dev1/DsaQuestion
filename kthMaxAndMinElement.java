package Arrays;
import java.util.*;
public class kthMaxAndMinElement {

    static void kthSmallestInteger(Integer arr[] , int k){
        Arrays.sort(arr);
        System.out.println("kth Smallest Integer is :"+arr[k-1]);


    }
    static void kthLargestInteger(Integer arr[] , int l){
        System.out.println("kth Largest Integer is :"+arr[l-1]);
    }
    public static void main(String[] args) {
        Integer arr[] = {22,11,9,7,16};
        int k = 2;
        int l = 3;
        kthSmallestInteger(arr,k);
        kthLargestInteger(arr,l);

    }
}

