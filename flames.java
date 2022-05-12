package strings;
import java.util.Scanner;
public class flames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();  // taking first string input
        String str2 = sc.next(); // taking second string input
        int a[] = new int[26];   // array or 25 index and 26 length   used to store number of every char count
        int b []= new int [26];   // array or 25 index and 26 length

        // loop for traversing in the string 1
        for(int i=0;i<str1.length();i++){
            a[str1.charAt(i) -'a']++;      // used to count the number of time a char comes in the string
                                           //   a[str1.charAt(i) -'a']++   eg. str1.charAt(0)   = 'a'
                                           //a['a' -'a']++   a[0]++;    increase the index [0] by 1
        }

        // loop for traversing in the string 2
        for(int i=0;i<str2.length();i++){
            b[str2.charAt(i) -'a']++;     //  // used to count the number of time a char comes in the string
                                          //   b[str2.charAt(i) -'a']++   eg. str2.charAt(0)   = 'a'
                                            //b['a' -'a']++   a[0]++;    increase the index [0] by 1
        }

        int sum = 0;   // initially sum is zero
        for(int i=0;i<26;i++){     // traversing the array
            sum+= Math.abs(a[i] -b[i]);   // subtract the common index position
        }
        String s []= {"Siblings","Friends","Love","Affection","Marriage","Enemy"};
        System.out.println(s[sum%6]);

                }
            }


