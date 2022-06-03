package Arrays;

public class allSubsequence {

    static void subsequence(String t,int i,int n,String s){
        // base condition
        if(i==n){
            System.out.println(t);
            return;
        }else{

            subsequence(t,i+1,n,s);
            t = t+s.charAt(i);
            subsequence(t,i+1,n,s);
        }

    }
    public static void main(String[] args) {
        // str = "abc"  ---> "",a,,b,c,ab,ac,bc,abc
        String s = "abccd";
        subsequence("",0,s.length(),s);

    }
}
