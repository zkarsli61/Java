package day20arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		List<Integer> listnum = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		listnum.add(17);
		listnum.add(23);
		listnum.add(11);
		listnum.add(17);
		listnum.add(3);
		listnum.add(5);
		listnum.add(8);
		listnum.add(-5);
		listnum.add(-3);

		System.out.println(listnum.isEmpty());
		System.out.println(list2.isEmpty());

		listnum.remove(3);
		listnum.remove(listnum.indexOf(8));

		List<Integer> listDiff = new ArrayList<>();

		for (int i = 0; i < listnum.size(); i++) {
			for (int j = i + 1; j < listnum.size(); j++) {
				listDiff.add(Math.abs(listnum.get(i) - listnum.get(j)));
			}
		}

		System.out.println(listDiff);
		Collections.sort(listDiff);
		System.out.println(listDiff);
		listDiff.get(0);
	}

}
