package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list1.add(8);
		list1.add(7);
		System.out.println(list1);
		multiplyEvenNumbersBy3(list1);
		System.out.println(list1);
	}

	private static void multiplyEvenNumbersBy3(List<Integer> list1) {

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) % 2 == 0) {
				list1.set(i, list1.get(i) * 3); // multiply by 3
			} else {
				list1.remove(i); // delete odd elements
				i--;
			}
		}
	}

}
