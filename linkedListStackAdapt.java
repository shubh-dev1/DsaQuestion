package Linkedlist;
import java.util.*;
public class linkedListStackAdapt {
    Node head;
    public int size;
    linkedListStackAdapt(){

        this.size =0;
    }
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add a element in the stack
     public void push(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
            newnode.next = head;
            head = newnode;
        }

    // remove the top most element in teh stack
   public  void pop(){
        if(size ==0){
            System.out.println("list is empty");
        }
        size--;
        head = head.next;

   }

   // return the value of the topmost element
     public void top(){
        if(head == null) {
            System.out.println("list id empty");
        }
         System.out.println(head.data);
     }

     // return the size of the stack how many element stack contain
     public int size(){
        return size;

     }


         // print the stack in order
      public void print(){
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data +"->");
            currnode = currnode.next;
        }

      }



    public static void main(String[] args) {
        linkedListStackAdapt list = new linkedListStackAdapt();
        list.push(2);   // push the element in the stack
        list.push(3);
        list.push(4);
        list.pop();   //remove the element in the stack
        list.top();    // print the topmost element in the stack
        System.out.println(list.size());   // print the size of the stack
        list.print();
//        list.pop();
//        list.top();
//        list.size();

    }
}
