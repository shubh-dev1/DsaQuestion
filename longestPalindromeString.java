package strings;

public class longestPalindromeString {
    public static void main(String[] args) {
       // String str1 = "cbabd";  // odd length string
       String str1 = "aaaabbaa";  // even length string
        int len = str1.length();

        int low;
        int high;
        int start =0;
        int end = 1;

        // for even

        for(int i= 1;i<len;i++){
            low = i-1;
            high = i;
             while(low >= 0 && high <len  && str1.charAt(low) == str1.charAt(high)){
                 if(high -low +1 >end){
                     start = low;
                     end = high-low+1;
                 }
                 low--;
                 high++;
             }

             // for odd string
            low = i-1;
            high = i+1;  // just change this in odd string
            while(low >= 0 && high <len  && str1.charAt(low) == str1.charAt(high)){
                if(high -low +1 >end){
                    start = low;
                    end = high-low+1;
                }

                low--;
                high++;
            }
        }
        int count = 0;
        for (int i = start;i<=start+end -1;i++){
            count++;
        }
        System.out.println(count);

    }
}
