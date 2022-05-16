package Linkedlist;

import java.util.*;

public class ll {
     Node head;
    public int size;
    ll(){

        this.size =0;
    }
    class Node{
        int data;
        Node next;

        Node (int data){   // constructor
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // addfirst
    public void addfirst(int data){
        Node newnode =  new Node(data);
        if(head == null){
            head = newnode;
            return;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }else{
            size--;
            head = head.next;
        }
    }



    public void deleteLast(){
        // when there is no element in the list

        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
            // when there is one node in the list
            if(head.next == null){
                head = null;
                return;
            }
            // when list contain more than one node\
        Node secondLast = head;
            Node lastnode= head.next;

            while(lastnode.next != null){
                lastnode = lastnode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
        // to get the value of first node
        public  int getFirst(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }else {

            return head.data;
        }
        }

        // to get the value of last node
    public  int getLast(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }

    // to get the value of any randon node
    public  int getRandom(int idx){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }else if(idx < 0 || idx >= size){   // when the given index is less then 0 and equal or greater then the size
            System.out.println("invalid argument");
            return -1;
        }
        Node temp = head;
        for(int i=0;i<idx;i++){    // reach to the index whose value we want to print
            temp = temp.next;
        }
        return temp.data;
    }


    // add the node to a given index

    public void addAtIdex(int data,int idx){
        Node node = new Node(data);
        if(idx < 0 || idx >= size){
            System.out.println("invalid argument");
        }else if(idx == 0){
            addfirst(data);
        }else if(idx == size){
            addLast(data);

//            Node temp = head;
//            while(temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = node;
        }else{

            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
           node.next = temp.next;
            temp.next = node;
        }
    }

    // delete a given index node

    public void deleteAtidx(int idx){
        if(idx < 0 || idx >=size){
            System.out.println("Invalid Argument");
        }else if(idx == 0){
            deleteFirst();
        }else if(idx == size-1){
            deleteLast();
        }else{
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp .next = temp.next.next;
            size--;
        }

    }


        // to calculate the size of the linked list
    public int getSize(){
        return size;
    }

    public void printList(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("null");

    }

    void traverse(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr = curr.next;
        }
        System.out.println("null");

    }



    public static void main(String args[]){
        ll list = new ll ();

        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);
        list.addfirst(0);


        list.traverse();

//        list.addLast(3);
//        list.addLast(4);
//        list.addLast(5);
//        list.addLast(6);
//        list.addLast(7);
//        list.deleteFirst();
//        list.deleteLast();
//        list.printList();
//        System.out.println();
//        System.out.println(list.getSize());
          // get the value of the first node
//        System.out.println(list.getFirst());
//        // get the value of the last node
//        System.out.println( list.getLast());
//
//        // get the value of the random node
//        System.out.println( list.getRandom(0));


        // add a node to the given index
//        list.addAtIdex(100,3);
//        list.addAtIdex(200,2);
//        list.addAtIdex(50,3);

        //list.deleteAtidx(3);
       // list.printList();


    }
}

//    Node head;
//    public int size;
//    ll(){
//
//        this.size =0;
//    }
//
//    class Node{
//        String data;
//        Node next;
//
//        Node(String data){
//            this.data = data;
//            this.next = null;
//            size++;
//        }
//    }
//
//    // add first
//    public void addFirst(String data){
//        // empty
//        Node newnode = new Node(data);
//        if(head == null){
//            head = newnode;
//            return;
//        }else{
//            newnode.next = head;
//            head = newnode;
//        }
//    }
//
//    // addlast
//
//    public void addLast(String data){
//        // empty
//        Node newnode = new Node(data);
//        if(head == null){
//            head = newnode;
//            return;
//        }else{
//            Node currnode = head;
//            while(currnode.next!= null){
//                currnode = currnode.next;
//            }
//            currnode.next = newnode;
//        }
//    }
//
//
//    // delete first
//    public void deleteFirst(){
//        if(head == null){
//            System.out.println("list is empty");
//            return;
//        }
//        else{
//            size--;
//            head = head.next;
//        }
//    }
//    // delete last
//
//    public void deleteLast(){
//        if(head == null){
//            System.out.println("list is empty");
//            return;
//        }
//        size--;
//        if(head.next == null){
//            head = null;
//            return;
//        }
//        Node secondLast = head;
//        Node lastnode = head.next;
//        while(lastnode.next != null){
//            lastnode = lastnode.next;
//            secondLast = secondLast.next;
//        }
//        secondLast.next = null;
//    }
//
//    // print
//    public void print(){
//        if(head == null){
//            System.out.println("list is empty");
//        }
//        Node currnode = head;
//        while(currnode != null){
//            System.out.print(currnode.data+"-> ");
//            currnode = currnode.next;
//        }
//        System.out.println("null");
//    }
//    public int getSize(){
//
//        return size;
//    }
//    public static void main(String args[]){
//        ll list = new ll();
//        list.addFirst("is");
//        list.print();
//
//        list.addFirst("this");
//        list.print();
//
//        list.addLast("a");
//        list.print();
//
//        list.addLast("list");
//        list.print();
//
//        list.deleteFirst();
//        list.print();
//
//        list.deleteLast();
//        list.print();
//
//        System.out.println(list.getSize());
//
//        list.addLast("list");
//        System.out.println(list.getSize());
//    }
//
//    }


