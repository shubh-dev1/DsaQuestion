package Recursions;

public class printNToOne {
    static void print(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 20;
        print(n);
    }
}
