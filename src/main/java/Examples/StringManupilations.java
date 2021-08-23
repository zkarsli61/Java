package Examples;

public class StringManupilations {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String name = scan.nextLine().trim();

		String name = "     aLi can    ".trim();

		if (name.isBlank()) {
			System.out.println("Just space characters or nothing invalid");
			System.exit(0);
		}

		if (!name.contains(" ")) {
			System.out.println("Space is not used between first and last name");
			System.exit(0);
		}

		String first = name.substring(0, name.indexOf(" "));
		first = first.substring(0, 1).toUpperCase() + first.substring(1);
		String last = name.substring(name.lastIndexOf(" ") + 1);
		last = last.substring(0, 1).toUpperCase() + last.substring(1);

		System.out.println(first + " " + last);
		
	}

}
