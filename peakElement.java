package Arrays;

public class peakElement {
    static int findPeak(int[] arr, int n){
        if(n==1){
            return 0;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        if(arr[n-1] >=arr[n-2]){
            return n-1;
        }

        for(int i=1;i<n-1;i++){
            if(arr[i] >=arr[i-1] && arr[i] >=arr[i+1]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int arr[] = {30,3,40,4,1,0};
        int n= arr.length;
        System.out.print(findPeak(arr,n));
    }
}
