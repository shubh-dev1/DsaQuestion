package Arrays;

public class countPairSum {
    public static void main(String args []){
        int arr[] = {1, 5, 7, -1, 5};
        int n= arr.length;

        int count =0;
        int sum=6;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] +arr[j] == sum){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
