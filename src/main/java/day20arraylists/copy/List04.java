package day20arraylists.copy;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(23);
		list1.add(12);
		list1.add(11);
		list1.add(13);
		list1.add(10);

		List<Integer> list2 = new ArrayList<>();
		list2.add(25);
		list2.add(2);
		list2.add(17);
		list2.add(18);
		list2.add(1);
		list2.add(115);

		List<Integer> list3 = new ArrayList<>();

		// Appends all of the elements in the specified collection to the end of this
		// list
		System.out.println(list1.addAll(list2));

		System.out.println(list1);
		// if we add empty list to the any list. adAll method returns false.
		System.out.println(list1.addAll(list3));

		// adding list4 into the index2
		list1.addAll(2, list2);

		System.out.println(list1);
		// to delete all the element from the list;

	}
}
