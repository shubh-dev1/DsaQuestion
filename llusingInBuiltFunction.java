package Linkedlist;
import java.util.*;
public class llusingInBuiltFunction {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<String>();

        list.addFirst("list");
        list.addFirst("a");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add("list");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        System.out.println(list.size());


        list.remove(3);
        System.out.println(list);
    }
}
