package BasicCode.Hashmaps;
import java.util.*;
public class   getCommonElement {
    public static void main(String args[]){
    int a1 [] = {1,2,3,4,5,1,2};
    int a2 [] = {1,3,3,4,5,1,2};
        HashMap<Integer,Integer> fmap = new HashMap<>();
            for(int val: a1){
                if(fmap.containsKey(val)){
                    int of = fmap.get(val);
                    int nf = of+1;
                    fmap.put(val,nf);

                }else{
                    fmap.put(val,1);
                }
            }
            for(int val : a2){
                if(fmap.containsKey(val)){
                    System.out.print(val+" ");
                    fmap.remove(val);
                }

            }
        }

    }
