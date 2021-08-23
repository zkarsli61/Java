package Examples;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name of the month");
		String month = scan.next().toLowerCase();

		System.out.println("zaaafer".replace("a", "i"));
		System.out.println(month.charAt(month.length() - 1));
		switch (month) {
		case "january":
			System.out.println(1);
			break;
		case "feb":
			System.out.println(2);
			break;
		default:
			System.out.println("Hello");
		}
		scan.close();
	}
}
