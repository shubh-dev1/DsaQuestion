package BasicCode.searching;

public class fisAndLastOptimal {
    static int first(int arr[],int n,int k){
        int start =0;
        int end = n-1;
        int res = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] >k){
                end = mid -1;
            }else if(arr[mid] < k){
            start = mid +1;
            }
            else{
            res = mid;
            end = mid -1;}
        }
return res;
    }


    static int last(int arr[],int n,int k){
        int start = 0;
        int end = n-1;
        int res = -1;
        while(start<=end){
            int mid = (start +end) /2;
            if(arr[mid] <k){
                start = mid +1;
            }
            else if(arr[mid] >k){
                end = mid - 1;
            }
            else{
                res =mid;
                start = mid+1;

            }
        }
        return res;

    }
    public static void main(String[] args) {
        int arr [] ={1,2,2,2,2,3,4,7,8,8,9};
        int n = arr.length;
        int k = 2;

        System.out.println(first(arr,n,k));
        System.out.println(last(arr,n,k));
    }
}
