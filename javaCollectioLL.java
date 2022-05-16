package Linkedlist;
import java.util.*;
public class javaCollectioLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println(list.size());
        list.peekLast();
        System.out.println(list.peek());
        System.out.println( list.getLast());
        System.out.println(list.getFirst());
        list.removeFirst();
        list.removeLast();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }
}
