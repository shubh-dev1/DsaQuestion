package Linkedlist;
import java.util.*;
public class reverseALinkedlist {
    Node head;
    class Node{
        int  data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    // add first
    public void addFirst(int data){
        // empty
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }

    // addlast

    public void addLast(int data){
        // empty
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }else{
            Node currnode = head;
            while(currnode.next!= null){
                currnode = currnode.next;
            }
            currnode.next = newnode;
        }
    }


    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        else{

            head = head.next;
        }
    }
    // delete last

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastnode = head.next;
        while(lastnode.next != null){
            lastnode = lastnode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // print
    public void print(){
        if(head == null){
            System.out.println("list is empty");
        }
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data+"-> ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public void reverseIterative(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
             prevNode = currNode;
             currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;
    }

    public static void main(String args[]) {
        reverseALinkedlist ll = new reverseALinkedlist();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.reverseIterative();
        ll.print();

        ll.reverseIterative();
        ll.print();

        ll.head = ll.reverseRecursive(ll.head);
        ll.print();
    }



}
