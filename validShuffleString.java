package strings;

public class validShuffleString {
    public static void main(String args[]) {
        // str1 = "XY"
        //str2 = "12"
        //str result = "X1Y2" this is valid shuffle
        //str result = "XZY2" this is not  valid shuffle

        String str1 = "XY";
        String str2 = "12";
        String result = "Y1X2";  // not a valid
        //String result = "X1Y2"; // valid

        int l1 = str1.length();
        int l2 = str2.length();
        int r = result.length();

        if ((l1 + l2) != r) {
            System.out.println("Not A valid Shuffle");
            return;
        } else {
            int i = 0;
            int j = 0;
            int k = 0;
            while (k < r) {
                if (i < l1 && str1.charAt(i) == result.charAt(k)) {
                    i++;
                } else if (j < l2 && str2.charAt(j) == result.charAt(k)) {
                    j++;
                } else {
                    System.out.println("Not a valid shuffle string ");
                    return;
                }
                k++;
            }
            if (i < l1 || j < l2) {
                System.out.println("Not a valid Shuffle String");
                return;
            } else {
                System.out.println("Valid string");
            }
        }

    }
}
