package day31iteratorscollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        LinkedList is very fast in insertion
        and deletion operations...
     */
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");

        System.out.println(ll1);

        ll1.add("Angie");
        ll1.add(2, "XXXX");
        ll1.addFirst("AAAA");
        ll1.addLast("XXXX");
        System.out.println(ll1.contains("Can"));//true
        System.out.println(ll1.contains("Mm"));//true
        System.out.println(ll1.element());//AAAA ==> Returns the first element without removing (copy + paste)
        //@throws NoSuchElementException if this list is empty

        System.out.println(ll1.getFirst());//AAAA ==> @throws NoSuchElementException if this list is empty

        System.out.println(ll1.getLast());//ZZZZ

        System.out.println(ll1.poll());//AAAA ==> Returns first element but removes the first element (cut + paste)
        //         Returns null if this list is empty

        ll1.peek();//Returns the first element without removing (copy + paste)
        //Returns null if this list is empty

        //ll1.removeFirstOccurrence("XXXX");

        ll1.removeLastOccurrence("XXXX");

        ll1.set(2, "!!!!");

        System.out.println(ll1.subList(2, 5));//[!!!!, Mark, Tom] Note: First index is inclusive, second is exclusive

        System.out.println(ll1);

    }

}
