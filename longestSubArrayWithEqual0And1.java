package Arrays;

public class longestSubArrayWithEqual0And1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 0};
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            int zerocount = 0;
            int onecount = 0;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] == 0) {
                    zerocount++;
                } else {
                    onecount++;
                }
                if (zerocount == onecount) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        if (maxlen > 0) {
            System.out.println(maxlen + " ");
        } else {
            System.out.println("no SubArray");
        }
    }
}
