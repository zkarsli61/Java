package day31iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        list1.add("Canan");

        System.out.println(list1);//[Ali, Can, Aliye, Canan]

        for (String w : list1) {

            w = w + "!";

        }

        //By using for-loop we are not able to change the collection elements
        System.out.println(list1);//[Ali, Can, Aliye, Canan]

        //Use Iterator

        ListIterator<String> list1itr = list1.listIterator();//[   Ali,    Can,    Aliye,   ]

        while (list1itr.hasNext()) {
            String element = list1itr.next();
            System.out.println(element);
        }
    }

}
