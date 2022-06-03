package Arrays;

public class allSubString {
    public static void main(String[] args) {
        String str ="abccd";
        int cnt =0;
        for(int i=0;i<str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                cnt ++;
                System.out.println(str.substring(i,j));

            }
        }
        System.out.println(cnt);
    }
}
