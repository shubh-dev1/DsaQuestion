package BasicCode.sortingAlgo;

public class selectionSortUsingFunction {
    public static int sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return n;
    }

    public static void main(String args[]) {
        int arr[] = {10, 9, 8, 7, 6};
        int n = arr.length;
        sort(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");

        }

    }
}
