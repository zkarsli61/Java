package Examples;

public class Question09 {

	public static void main(String[] args) {

		drawStar(5);
	}

	public static void drawStar(int i) {

		String str = "*";
		for (int j = i; j > 0; j--) {
			System.out.println(str.repeat(j));
		}
	}

}
