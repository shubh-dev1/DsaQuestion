package strings;

public class substringWithEqual0nd1 {
    //Split the binary string into substrings with equal number of 0s and 1s
    //The required substrings are “01”, “0011”, “01” and “01”.
    public static int equaleZeroAndOne(String str,int n){
           int zero =0;
           int one =0;

           int cnt =0;

           for(int i=0;i<n;i++){
               if(str.charAt(i) == '0'){
                   zero++;
               }else{
                   one++;
               }
               if(zero == one){
                   cnt++;
               }
           }

           if(zero != one){
               return -1;
           }
           return cnt;
    }





    public static void main(String[] args) {
        String str = "0100110101";
        int n = str.length();

        System.out.println(equaleZeroAndOne(str,n));
    }
}
