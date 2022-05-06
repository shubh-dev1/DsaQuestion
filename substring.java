package strings;
import java.util.*;
public class substring {
    static boolean sub(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();


        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;

            if (j == M)
                return true;
        }

        return false;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean res = sub(s1, s2);

        if (res == false)
            System.out.println("No");
        else
            System.out.println("Yes");
    }

}


