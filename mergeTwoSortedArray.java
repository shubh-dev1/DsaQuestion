package Arrays;

public class mergeTwoSortedArray {
    static void mergeArray(int a[] ,int b[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[0]) {
                temp = a[i];
                a[i] = b[0];
                b[0] = temp;


                int j = 0;
                while ((j + 1 < b.length )&& (b[j] > b[j + 1])) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 6, 8};
        int b[] = {3, 5, 7};
        mergeArray(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
    }
}
