package strings;
import java.util.*;
public class anagram {

    // time complexity is o(n)
    public static void main (String args[]){
        String str1 = "silent";
        String str2 = "listen";

        int n1 = str1.length();
        int n2 = str2.length();

        if(n1!= n2){
            System.out.println("Not anagram");
            return;
        }
        char a[] = str1.toCharArray();
        char b []= str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<n1;i++){
            if(a[i] != b[i]){
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");

    }
}
