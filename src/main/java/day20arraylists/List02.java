package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);

		System.out.println(list);
		addElementBy2(list);
		System.out.println(list);

		for (int i = 0; i < list.size(); i += 2) {
			System.out.println(list.get(i));
		}

	}

	public static List<Integer> addElementBy2(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) * 2);
		}
		return list;
	}

}
