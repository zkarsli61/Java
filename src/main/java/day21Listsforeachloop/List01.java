package day21Listsforeachloop;

import java.util.Arrays;
import java.util.List;

public class List01 {

	public static void main(String[] args) {

		// how to convert an array to a list
		Character c[] = new Character[4];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';

		List<Character> lc = Arrays.asList(c);
		lc.set(2, 'z');
		System.out.println(lc);

	}

}
