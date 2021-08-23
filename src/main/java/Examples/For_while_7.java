package Examples;

public class For_while_7 {

	public static void main(String[] args) {

		perfectNum(6);
		perfectNum(7);

	}

	public static void perfectNum(int num) {
		int sumDiv = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumDiv += i;
			}
		}
		System.out.println(num + (num == sumDiv ? " is" : " is not") + " Perfect Number");
	}
}
