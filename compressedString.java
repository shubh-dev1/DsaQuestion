package Arrays;
import java.util.Scanner;
public class compressedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        for(int i=0;i<n;i++){
            int count =1;
            while(i<n-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count==1){
                System.out.print(str.charAt(i) + "1");
            }else {
                System.out.print(str.charAt(i));
                System.out.print(count);
            }
        }
    }

        }

//
//    static void gen_compressed_str(String str) {
//        int n = str.length();
//        for (int i = 0; i < n; i++) {       // 3,2   AAABBBCCD
//            int count = 1;
//            while (i < n - 1 &&
//                    str.charAt(i) == str.charAt(i + 1)) {
//                count++;
//                i++;
//            }
//
//            if (count == 1) {
//                System.out.print(str.charAt(i) + "1");
//            } else {
//                System.out.print(str.charAt(i));
//                System.out.print(count);
//            }
//
//        }
//        System.out.println();
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        while (a-- > 0) {
//            String str = sc.next();
//
//            gen_compressed_str(str);
//        }
//    }
//}





