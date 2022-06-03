package Arrays;

public class barChart {
    public static void main(String[] args) {
        int arr[] ={2,3,4,1,5};
        int n = arr.length;

        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }
        for(int floor = max;floor>=1;floor--){

        }
    }
}
