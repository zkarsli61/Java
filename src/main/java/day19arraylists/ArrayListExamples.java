package day19arraylists;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(45);
		list.add(12);
		list.add(3);
		list.add(6);
		list.add(45);
		list.add(7);
		list.add(7);
		list.add(8);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}
}
