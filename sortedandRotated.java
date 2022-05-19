package BasicCode.searching;

public class sortedandRotated {
    static int binsearch(int arr[],int key){
        int low =0;
        int end = arr.length-1;

        while(low<=end){
            int mid = (low+end)/2;
            if(arr[mid] ==  key){
                return mid;
            }
            if(arr[low] < arr[mid]){
             if(key >=arr[low] && key<arr[mid]){
                 end = mid -1;
             }else{
                 low = mid+1;
             }
            }else{
                if(key > arr[mid] && key <=arr[end]){
                    low = mid+1;
                }else{
                    end = mid -1;
                }
            }
            }
        return -1;
        }
    public static void main(String[] args) {
        int arr[] ={20,30,1,2,3,10};
        int key =3;
        int result = binsearch(arr,key);
        if(result == -1){
            System.out.println("not found");
        }else{
            System.out.println("found at " + result);
        }
    }
}
