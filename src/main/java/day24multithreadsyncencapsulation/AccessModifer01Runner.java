package day24multithreadsyncencapsulation;

import day23stringbuilders.AccessModifier02;

import java.util.Arrays;

public class AccessModifer01Runner {

	public static void main(String[] args) {

		AccessModifier01 obj1 = new AccessModifier01();
		AccessModifier02 obj2 = new AccessModifier02();

		obj1.address = "dsafs0";
		System.out.println(obj1.address);

		int[] arr= {1,2,3};
		System.out.println(arr.length);
	}

}
