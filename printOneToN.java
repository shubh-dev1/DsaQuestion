package Recursions;

public class printOneToN {
   static void num(int n){
       if(n >20){
           return;
       }
        System.out.print(n+" ");
        num(n+1);

    }
    public static void main(String[] args) {
        int n =1;
        num(n);
    }
}
