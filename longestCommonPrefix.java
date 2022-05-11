package strings;

public class longestCommonPrefix {

    // string array
    public static String longestCommonPrefix(String[] strs) {
    StringBuilder longestCommonPrefix = new StringBuilder();
    if(strs == null || strs.length==0 ){
        return longestCommonPrefix.toString();
    }
        // find the minlength string in the String array
    int minlength = strs[0].length();
    for(int i=1;i<strs.length;i++){
        minlength = Math.min(minlength,strs[i].length());
    }
        // check only for that length for each char and store in a char
    for(int i=0;i<minlength;i++){
        char current = strs[0].charAt(i);

        for(String str : strs){
            if(str.charAt(i)!= current){
                return longestCommonPrefix.toString();
            }
        }
        longestCommonPrefix.append(current);
    }
    return longestCommonPrefix.toString();
}


    public static void main(String[] args) {
  //   String [] strs = {"flower","flow","flight"};
        String [] strs = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));


    }
}
