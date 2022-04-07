package Arrays;
import java.util.*;
public class duplicateElement {
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,2,3,3,4,5};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int s = arr[i];
            if(hm.containsKey(s)){
                int of = hm.get(s);
                int nf = of+1;
                hm.put(s,nf);

            }else{
                hm.put(s,1);
            }
        }
        for(int val : hm.keySet()){
            if(hm.get(val) >1){
                System.out.println(val);
            }

        }


    }
}
