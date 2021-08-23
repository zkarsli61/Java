package Examples;

public class For_while_9 {

	public static void main(String[] args) {

		int input = 2857;
		while (input >= 10) {
			System.out.print("" + input % 10);
			input /= 10;
		}
		System.out.println(input);
	}

}
