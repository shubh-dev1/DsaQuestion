package strings;
import java.util.*;
public class anagramUsingHashing {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (hm.containsKey(ch)) {
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch, nf);

            } else {
                hm.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (hm.containsKey(ch)) {
                int of = hm.get(ch);
                int nf = of - 1;
                hm.put(ch, nf);

            } else {
                hm.put(ch, 1);
            }
        }

        Set<Character> keys = hm.keySet();
        for(Character key : keys ){
            if(hm.get(key) != 0){
                System.out.println("Not anagram");
                return;
            }else{
                System.out.println("anagram");
                return;
            }
        }
    }

        }

