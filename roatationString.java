package strings;

public class roatationString {
    public static void main(String[] args) {


    // str1 = ABACD;
    // str2 = CDABA;
    String str1 = "ABACD";
    String str2 = "CDABA";

    int li = str1.length();
    int l2= str2.length();

    if(li!=l2){
        System.out.println("Not Rotation");
    }else{
        str1 = str1.concat(str1);

        if(str1.indexOf(str2) != -1){
            System.out.println("rotated string");
        }else{
            System.out.println("not rotated");
        }
    }

    }
}
