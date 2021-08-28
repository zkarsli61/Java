package day19Loop;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("your age");
		int age = scan.nextInt();
		System.out.println("your gender");
		char gender = scan.next().toUpperCase().charAt(0);
		String result = gender == 'M' ? (age > 65 ? "Retired" : "Need to work")
				: (age > 60 ? "Retired" : "Need to work");
		System.out.println(result);
		scan.close();
	}

}
