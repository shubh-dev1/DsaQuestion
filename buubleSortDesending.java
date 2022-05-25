package BasicCode.sortingAlgo;

public class buubleSortDesending {
    public static void main(String[] args) {
        int n=10;
        int arr[]= {0,1,2,3,4,5,6,7,8,9};
        // loop for traversing in the array
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i] +" ");
    }
}
