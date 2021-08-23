package day34maps;

import java.util.Hashtable;

public class HashTable01 {
	
	/*
	 	1)Hashtable is thread-safe and synchronized
	 	2)Hashtable does not put the elements in any order
	 	3)Hashtable does not allow to use "null" in keys and in values
	 	4)Hashtable works with being thread-safe and synchronization, and checking to be null, because of that it
	 	  is slower than HashMap
	 */

    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(100, "Ali");
        ht1.put(101, "Veli");
        ht1.put(102, "Can");
        //ht1.put(null, "XXXX");//Throws NullPointerException
        //ht1.put(103, null);//Throws NullPointerException

        System.out.println(ht1);

    }

}
