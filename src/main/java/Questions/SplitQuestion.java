package Questions;
import java.util.Scanner;

public class SplitQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the long sentence");
		String word1 = scanner.nextLine();
		String[] word1toArray = word1.split("\\s+");  // or you can use  "\\s+"
		System.out.println("Your Sentence have; " + word1toArray.length + " words");
	
	}

}
