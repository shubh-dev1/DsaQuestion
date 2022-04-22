package Arrays;

public class replaceWithGreatestOnRightSide {
    static void printArray(int arr[]){
        int size = arr.length;  // 16,17,4,3,5,2    17 5 5 5 2 -1
        int maxR = arr[size -1];

        arr[size -1] = -1;

        for(int i = size -2;i>=0;i--){
            int temp = arr[i];

            arr[i] = maxR;
            if(maxR < temp){
                maxR = temp;
            }

        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }


    }

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        printArray(arr);
    }
}
