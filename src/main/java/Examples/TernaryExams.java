package Examples;

import java.util.Scanner;

public class TernaryExams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name = scan.next();

		int length = name.length();

		String last2Char = "";

		if (length < 2) {
			System.out.println("The strings length will be at least 2");
		} else {
			last2Char = name.substring(name.length() - 2);
			System.out.println(last2Char.repeat(3));
		}

		scan.close();

	}
}
