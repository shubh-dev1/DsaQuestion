package Arrays;

public class reverseTheArray {
    public static void main(String[] args) {
        int arr[] = {23,24,18,41,22,20,25};

        int start = 0 , end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }





//        int n = arr.length;
//        for(int i=n-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }







//     int arr[ ] = {5,4,3,2,1};
//     int n = arr.length;
//
//        int start =0;
//        int end = n-1;
//        while(start<=end){
//            int temp = arr[start];
//            arr [st,art] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        for(int j =0;j<n;j++) {
//            System.out.print(arr[j] + " ");
//
//        }

    }
}

