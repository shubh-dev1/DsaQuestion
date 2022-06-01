package Arrays;

public class allPermutationOfString {
    static void permuatation(String str ,int l,int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permuatation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
        
      public static String swap(String a,int i,int j){
        char []charArray = a.toCharArray();
          char temp = charArray[i];
          charArray[i] = charArray[j];
          charArray[j] = temp;
        
        return String.valueOf(charArray);
        }
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permuatation(str,0,n-1);
 
     }
}
