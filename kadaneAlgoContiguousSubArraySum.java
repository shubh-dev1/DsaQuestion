package Arrays;

public class kadaneAlgoContiguousSubArraySum {
    static void maxSumArray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            cursum = cursum + arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }

        }

        System.out.println(maxsum);
    }


    public static void main (String[]args){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5 ,-3};
        maxSumArray(arr);
    }
}
