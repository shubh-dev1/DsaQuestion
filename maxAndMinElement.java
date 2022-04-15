package Arrays;

public class maxAndMinElement {
    public static void main(String[] args) {


    int arr[] = { 2,3,1,5,7,4};
    int max,min;
        if(arr[0] > arr[1]){
        max = arr[0];
        min = arr[1];
    }else{
        max = arr[1];
        min = arr[0];
    }

        for(int i=2;i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
        }
        else if(min > arr[i]){
            min = arr[i];
        }
    }
        System.out.println("maximum element is : " + max +" " + " minimum element is : "+ min);
}
}
