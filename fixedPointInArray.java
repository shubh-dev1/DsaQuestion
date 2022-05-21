package BasicCode.searching;

public class fixedPointInArray {
    public static void main(String[] args) {
        int arr[] =  {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        int n= arr.length;
        int res = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == i) {
                System.out.println(i);

            }
        }
    }
}
