package BasicCode.Hashmaps;
import java.util.*;
public class longestConsecutiveInteger {
    public static void main(String args[]) {
        int arr[] = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int val : arr) {
            hm.put(val, true);
        }
        for (int val : arr) {
            if (hm.containsKey(val - 1)) {
                hm.put(val, false);
            }
        }
        int msp = 0;
        int ml = 0;
        for (int val : arr) {
            if (hm.get(val) == true) {
                int tl = 1;
                int tsp = val;

                while (hm.containsKey(tsp + 1)) {
                    tl++;
                }
                if (tl > ml) {
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        for (int i = 0; i < ml; i++) {
            System.out.println(msp + i);
        }
    }
}
