package stackDsa;
import java.util.*;
//
//    class stack{
//        int size;
//        int top;
//        char[]a ;
//        stack(int n){
//            top =-1;
//            size= n;
//            a = new char [size];
//        }
//
//        // function to check is stack isEmpty
//        boolean isEmpty(){
//            return (top<0);
//        }
//
//        // push element in the stack
//        boolean push(char x){
//            if(top>=size){
//                System.out.println("stack overflow");
//                return false;
//            }else{
//                a[++top] = x;
//                return true;
//            }
//        }
//        // pop element from stack
//
//        char pop(){
//            if(top<0){
//                System.out.println("undeflow");
//                return 0;
//            }else{
//                char x= a[top--];
//                return x;
//            }
//        }
//    }
//public class reverseAStringUsingStack {
//
//public static void reverse(StringBuffer str){
//    int n = str.length();
//    stack ob = new stack(n);
//    for(int i=0;i<n;i++){
//        ob.push(str.charAt(i));
//    }
//    for(int i=0;i<n;i++){
//        char ch = ob.pop();
//        str.setCharAt(i,ch);
//    }
//    }
//
//    public static void main(String args[]){
//        StringBuffer s = new StringBuffer("Shubham");
//        reverse(s);
//        System.out.println(s);
//    }
//}

