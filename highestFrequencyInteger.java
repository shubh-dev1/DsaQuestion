package BasicCode.Hashmaps;
import java.util.*;
public class highestFrequencyInteger {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,1,1,2,1,3,4};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(hm.containsKey(a)){
                int of = hm.get(a);
                int nf = of+1;
                hm.put(a,nf);
            }else{
                hm.put(a,1);
            }
        }

        int mfc = arr[0];
        for(int key : hm.keySet()){
            if(hm.get(key) >hm.get(mfc)){
                mfc = key;
            }
        }
        System.out.println("Highest Frequency Integer is :"+ mfc);

    }

}
