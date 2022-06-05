package BasicCode.slidingWindow;

public class maxSumArrayOfSizeK {
    public static int maxSum(int arr[],int n,int k){
        if(n<k){
            System.out.println("Invalid");
            return-1;
        }
// find the sum of the given size here
        int res = 0;
        for(int i=0;i<k;i++){
            res+= arr[i];
        }
        // find the sum of every sub array of size k by incremeneting the pointer by one and subtract the extra sum/pointer
        int currsum = res;
        for(int i=k;i<n;i++){
            currsum += arr[i] -arr[i-k];
            res= Math.max(res,currsum);
        }
        return res;
    }




    public static void main(String args[]){
        int arr[] ={1,2,3,4,5};
        int n= arr.length;
        int k=2;

        System.out.println(maxSum(arr,n,k));
    }
}
