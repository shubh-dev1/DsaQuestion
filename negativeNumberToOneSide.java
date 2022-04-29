package Arrays;

public class negativeNumberToOneSide {
    static void rearrange(int arr[]) {
        int t[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                t[j++] = arr[i];
            }
        }

        if (j == arr.length || j == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                t[j++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = t[i];
            System.out.print(arr[i] + " ");
        }
    }
}
