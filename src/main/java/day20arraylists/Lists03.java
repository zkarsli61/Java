package day20arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists03 {

	public static void main(String[] args) {

		List<Character> list = new ArrayList<>();
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('S');
		list.add('F');

		System.out.println(list);

		// how to check arrayList contains a specific element

		System.out.println(list.contains('B'));

		List<Character> list2 = new ArrayList<>();
		list2.add('B');
		list2.add('E');
		list2.add('A');
		list2.add('S');
		list2.add('F');

		System.out.println(list2);

		System.out.println(list.equals(list2));

		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);

		if (list.contains(letter)) {
			list.set(list.indexOf(letter), '$');
		} else {
			list.add(letter);
		}
		System.out.println(list);
		scan.close();
	}

}
