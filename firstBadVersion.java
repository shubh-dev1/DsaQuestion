package BasicCode.searching;

public class firstBadVersion {
    static  int bad(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start<=end){

            if(start == end && arr[start] == 0){
                return -1;
            }
            if(start == end ){
                return start;
            }
            int mid = (start + end)/2;
            if(arr[mid] ==1){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] ={1,1,1,1};
        int result = bad(arr);
        if(result == -1){
            System.out.println("no bad version");
        }else{
            System.out.println("bad version is at "+result);
        }
    }
}
