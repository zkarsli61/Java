package day31iteratorscollections;

import java.util.*;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        for (String w : list1) {

            w = w + "!";

        }
        //By using for-loop we are not able to change the collection elements
        System.out.println(list1);//[Ali, Can, Aliye]
        //Use Iterator
        //How to update list by using ListIterator
        ListIterator<String> list1itr = list1.listIterator();//[   Ali,    Can,    Aliye,   ]
        while (list1itr.hasNext()) {
            String element = list1itr.next();
            list1itr.set(element + "!");
        }
        System.out.println(list1);//[Ali!, Can!, Aliye!]

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Samsung");
        list2.add("Huavei");

        //Update all elements and print them in reverse order

        ListIterator<String> list2Itr = list2.listIterator();// [   Apple,   Samsung,   Huavei   ]

        //To move the pointer to the end, use "hasNext()" and "next()"
        while (list2Itr.hasNext()) {
            list2Itr.next();
        }
        //When you use "hasPrevious()" and "previous()" methods, you will be able to work with the list element
        //in reverse order.
        while (list2Itr.hasPrevious()) {
            String element = list2Itr.previous();
            list2Itr.set(element + "?");
        }

        Collections.reverse(list2);
        System.out.println(list2);

        //How to remove all elements by using ListIterator
        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("C");
        list3.add("B");

        ListIterator<String> list3Itr = list3.listIterator();// [    A,    B,    C   ]

        System.out.println("Before removing: " + list3);

        //If you use remove() method without using next() you will get IllegalStateException
        while (list3Itr.hasNext()) {
            list3Itr.next();
            list3Itr.remove();
        }

        System.out.println("After removing: " + list3);

        //How to add elements into a list by using ListIterator
        List<String> list4 = new ArrayList<>();
        list4.add("X");
        list4.add("Y");
        list4.add("Z");

        ListIterator<String> list4Itr = list4.listIterator();

        //If you use while loop like below, elements will be added to the end, if you do not use
        //while loop elements will be added to beginning of the list
        while (list4Itr.hasNext()) {
            list4Itr.next();
        }

        list4Itr.add("T");
        list4Itr.add("U");
        list4Itr.add("V");

        System.out.println(list4);//[X, Y, Z, T, U, V]


        //Difference between Iterator and ListIterator
        List<String> list5 = new ArrayList<>();
        list5.add("AB");
        list5.add("CD");
        list5.add("EF");

        Iterator<String> list5Itr = list5.iterator();
        //In Iterator, there is no hasPrevious() and previous() methods, because of that it is one-directional
        //In Iterator, there is no add() method, so we cannot add new elements by using Iterator
        //In Iterator, there is no set() method, so we cannot modify the elements by using Iterator
        //In Iterator and in ListIterator, there is remove()
        //Iterator can be used in other Collections(Map, Set, List), but ListIterator can be used just in Lists
        while (list5Itr.hasNext()) {
            String element = list5Itr.next();
        }
    }
}
