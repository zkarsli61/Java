package Questions;

public class deneme1 {

	public static void main(String[] args) {

		/*
		 * String name = "abc"; name = "elif";
		 *System.out.println(name); //elif
		 */
		StringBuilder stb = new StringBuilder();
		StringBuilder stb2 = stb;
		stb.append("asli");
		System.out.println("14="+stb);
		System.out.println("15="+stb2);
		System.out.println(stb.equals(stb2));
		System.out.println(stb.equals(stb.reverse()));
		System.out.println(stb);
		System.out.println(stb.reverse());
	}

}
