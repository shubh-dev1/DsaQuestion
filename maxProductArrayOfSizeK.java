package BasicCode.slidingWindow;

public class maxProductArrayOfSizeK {
    public static int maxproduct(int arr[] ,int n,int k){
        if(n<k){
            System.out.println("intvalid");
            return -1;
        }

        int res =1;
        for(int i=0;i<k;i++){
            res *= arr[i];
        }
        int currprod = res;
        for(int i=k;i<n;i++){
            int pro = (currprod/arr[i-k]) *arr[i];
          //  currprod *= arr[i];
           //int pro= currprod/arr[i-k];
          res = Math.max(res,pro);
          currprod = res;

        }
        return res;

    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 8, 2, 4,
                1, 8, 1, 2};
        int n= arr.length;
        int k=6;

        System.out.println((maxproduct(arr,n,k)));
    }
    }