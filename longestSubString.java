package strings;

import java.util.HashSet;

public class longestSubString {
    static String longest(String str){
        HashSet<Character> set = new HashSet<>();
        String longestoverall="";
        String longestTillNow="";

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(set.contains(c)){
                longestTillNow="";
                set.clear();
            }
            set.add(c);
            longestTillNow += c;
             if(longestTillNow.length() > longestoverall.length()){
                 longestoverall = longestTillNow;
             }
        }
        return longestoverall;
    }

    public static void main(String[] args) {
        String str = "abcdabcdef";
       System.out.println(longest(str));
    }
}
