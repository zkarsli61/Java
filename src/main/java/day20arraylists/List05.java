package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class List05 {

	// 1. please write a method which adds * to the all elements

	// 2. Given a list of integers, return a list where each integer is multiplied
	// with itself.
	// please create a method which multiplies all the elements by itself and then
	// call it from the main method

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("aa");
		str.add("bab");
		str.add("ab");
		str.add("ac");

		ArrayList<Integer> listnum = new ArrayList<>();
		listnum.add(1);
		listnum.add(2);
		listnum.add(3);
		listnum.add(4);
		listnum.add(5);
		listnum.add(6);

		System.out.println(addStar(str));
		System.out.println(multiplyByElement(listnum));

	}

	public static List<String> addStar(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) + "*");
		}
		return list;
	}

	public static List<Integer> multiplyByElement(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) * list.get(i));
		}
		return list;
	}
}
