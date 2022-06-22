package Arrays;

public class peakElementOptimize {
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,5};
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start + end)/2;

            if((mid == 0 || arr[mid-1] <=arr[mid]) && (mid== n-1 || arr[mid] >= arr[mid+1])){
                System.out.println(mid);
                return;
            }else if(mid > 0 && arr[mid-1] > arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        };
        System.out.println(-1);
    }
}
