package strings;

public class anagramoptimalsol {
    static void anagram(char str1[],char str2[]){
        int n1 = str1.length;
        int n2 = str2.length;
        if(n1!= n2){
            System.out.println("not anagram");
            return;
        }
        int count []= new int [256];

        for(int i=0;i<str1.length;i++){
            count[str1[i] -'a']++;
            count[str2[i] -'a']--;
        }

        for(int i=0;i<str1.length;i++){
            if(count [i] != 0){
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }




    public static void main(String[] args) {
        char str1[] = "geeksforgeeks".toCharArray();
        char str2[] = "forgeeksgeeks".toCharArray();

        anagram(str1,str2);

    }
}
