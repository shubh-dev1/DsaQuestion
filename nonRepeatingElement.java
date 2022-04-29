package Arrays;

public class nonRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {1,5,5,1,7,7};
        int n= arr.length;
        for(int i=0;i<n;i++){
            int j=0;
            for(j=0;j<n;j++){
                if(i!=j && arr[i] ==arr[j]){
                    break;
                }
            }
            if(j == n){
                System.out.println(arr[i] +" ");
                return;
            }
        }
        System.out.println("-1");
    }
}
