package Arrays;

public class ccountAndSay {
    public static void main(String[] args) {
        int n = 5;

        if(n == 1){
            System.out.println("1");
            return;
        }
        if(n == 2){
            System.out.println("11");
            return;
        }
        String str = "11";
        for(int i=3 ;i<=n;i++){
            str += '$';
            int len = str.length();
            int cnt =1;
            String temp = "";
            char arr[] = str.toCharArray();
            for(int j=1;j<len;j++){
                if(arr[j] != arr[j-1]){
                    temp +=  cnt;
                    temp += arr[j-1];
                    cnt =1;
                }
                else{
                    cnt++;
                }
            }
            str = temp;
        }
        System.out.println(str);
    }
}