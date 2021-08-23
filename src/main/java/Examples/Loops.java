package Examples;

public class Loops {

	public static void main(String[] args) {

		String s = "safadsf";
		System.out.println(s);
		int length = s.length();
		char first;

		for (int i = 0; i < (length); i++) {

			first = s.charAt(i);

			if (s.indexOf(first) == s.lastIndexOf(first)) {

				System.out.println("non-repeat characters: " + first);

			}
		}

		String reversed = "";
		for (int i = length - 1; i >= 0; i--) {

			reversed = reversed + s.charAt(i);
		}

		System.out.println(reversed);
		System.out.println("String is " + (s.equals(reversed) ? "" : "not") + " Palindrom");
	}
}
