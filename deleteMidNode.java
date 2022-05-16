package Linkedlist;
import java.util.*;
public class deleteMidNode {
    Node head;
    class Node{
        int data;
        Node next;
         Node(int data){
             this.data = data;
             this.next = null;
         }
    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" ->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    static int countNodes(Node head){
        int count =0;
        while(head != null){
            head = head.next;
            count ++;
        }
        return count;
    }

    static Node deleteMid(Node head){
        if(head == null){
            System.out.println("null");
        }
        if(head.next == null){
            System.out.println("null");
        }
        Node midhead = head;
        int count = countNodes(head);
        int mid = count/2;
        while(mid-->1){
            head = head.next;
        }
        head.next = head.next.next;

        return midhead;
    }
    public static void main(String[] args) {
        deleteMidNode list = new deleteMidNode();

        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

      list.head = list.deleteMid(list.head);

      list.printList();

        list.head = list.deleteMid(list.head);

        list.printList();
        list.head = list.deleteMid(list.head);

        list.printList();
        list.head = list.deleteMid(list.head);

        list.printList();


    }
}
