package Arrays;

public class duplicateInArray {
    public static void main(String[] args) {
        int arr[] = {20,10,50,30,40,50,10,};

        for(int i=0;i<arr.length;i++){
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] >=2*arr.length){
                System.out.print(i +" ");
            }
        }
    }
}
