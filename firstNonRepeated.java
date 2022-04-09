package Arrays;

public class firstNonRepeated {
    public static void main(String args[]){
        int arr[] = {2,2,3,4,3,6,8,1,3};


        for(int i=0;i<arr.length;i++){
            int cnt =1;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    cnt++;

                }
            }
            if(cnt == 1){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
