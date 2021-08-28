package day20arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		/*
		 * is resizeable we can store nonpirimitives we can store multiple data types
		 */

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
//		ArrayList<Integer> list 4 = new List<Integer>();

		list1.add(3);
		list1.add(4);
		list1.add(7);
		list1.add(6);
		list1.add(13);
		list1.add(12);
		list1.add(27);

		System.out.println(list1);
		// how to add elements into specific index

		list1.add(3, 8);

		System.out.println(list1);

		// how to sort array list

		Collections.sort(list1);

		System.out.println(list1);

		// how to sort an list in descending order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		// how to print pecific element from ArrayList

		System.out.println(list1.get(2));

		// how to get number of element ?
		System.out.println(list1.size());

	}

}
