package strings;

import java.util.*;

public class firstRepeatedChar {
    public static void main(String[] args) {
        String str = "AABCBDCEF";
            Map<Character,Integer> map = new HashMap();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                }else{
                    map.put(ch,1);
                }
            }
            System.out.println(map);
            for(Map.Entry<Character,Integer> entrySet : map.entrySet()){
                if(entrySet.getValue() == 1){
                    System.out.println(entrySet.getKey());
                    break;
                }
            }
            // approach -2

//        for(int i=0;i<str.length() ;i++){
//            boolean unique = true;
////            int cnt = 1;
//            for(int j =0;j<str.length();j++){
//                if( i!=j && str.charAt(i) == str.charAt(j)){
//                    unique = false;
////                    cnt++;
//                    break;
//
//                }
//            }
//            if(unique){
//                System.out.println(str.charAt(i));
//            }
        }
    }

