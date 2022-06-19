package Arrays;

public class negativeOneSide {

    static int[] rotateSubArray(int[] arr, int l, int r) {
        int temp = arr[r];
        for (int j = r; j > l - 1; j--) {
            arr[j] = arr[j - 1];
        }
        arr[l] = temp;

        return arr;
    }
    public static void main(String[] args) {
        int arr [] = { 5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1 };
        int last_negative_index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                last_negative_index += 1;
                int temp = arr[i];
                arr[i] = arr[last_negative_index];
                arr[last_negative_index] = temp;

                // Done to manage order too
                if (i - last_negative_index >= 2)
                    rotateSubArray(arr, last_negative_index + 1, i);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    }

