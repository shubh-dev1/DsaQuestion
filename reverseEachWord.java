package strings;

public class reverseEachWord {
    public static void main(String[] args) {
        String input = "Hello world";
         String output = ""; // storing the output that we want
        String []  words = input.split(" ");  // eachg words in the string
        for( String word : words){  // foch each loop running for each words string array
            String revwords = "";  // storing the every reverse words
            for(int i= word.length() -1;i>=0;i--){  // loop is traversing from the end in each word
                revwords = revwords + word.charAt(i);
            }
            output = output + revwords+" "; // storing the each words after reversing the each letter
        }
        System.out.println(output);
    }
}
