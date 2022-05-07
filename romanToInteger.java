package strings;
import java.util.*;
public class romanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        // put all the roan character with their value in the map
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
          // length of the string
        int n = s.length();
        // store the value of the char at the end of the string
        int num = map.get(s.charAt(n-1));
        // troversing start from the last second char
        for(int i=n-2;i>=0;i--){
            // conditon to check whether the element at i is greater than i+1
            // for number like "VI" "VII"
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                num = num + map.get(s.charAt(i));
            }else{
                // for number like "IV" "IX"
                // here we decrease from the number
                num = num - map.get(s.charAt(i));
            }
        }
        return num;

    }
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }

    }
