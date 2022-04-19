package Arrays;
import java.util.*;
public class nonRepeatingOptimal {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,6,6,9};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a= arr[i];
            if(hm.containsKey(a)){
                int of = hm.get(a);
                int nf =of+1;
                hm.put(a,nf);
            }else{
                hm.put(a,1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i]) == 1){
                System.out.println(arr[i]+" ");
                return;
            }

        }
        System.out.println("-1");
    }
}
