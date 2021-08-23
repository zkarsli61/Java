package Examples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReviewTillLists {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		Student[] arr2 = { new Student(1, "zafer"), new Student(2, "emir") };
//		Student std1 = new Student(1, "zafer");
		System.out.println(Array.getInt(arr1, 2));
		System.out.println(Arrays.toString(arr2));
		System.exit(0);
		Arrays.sort(arr2);
		Arrays.binarySearch(arr2, 3);

		// ask user to guess the number (absolute number);
		// If user enters the first time, message is ==> "Enter your number"
		// for second or other entries direct the user if his/her guess is below or
		// above the number
		// ==> "your guess is below than the number"
		// ==> "your guess is above than the number"
		// When the user is correct, congrats him by the message ==> "Congrats, You got
		// it right!"
		// Show him the all the numbers he entered so far in sorted order but only the
		// unique numbers
		// Example output [1,3, 5, 6, 90]

		// generate or assign a random number
		int randomNumber = (int) (Math.floor((Math.random() * 10) + 1));

		// random number printed for testing purpose
		System.out.println("Generated random number is : " + randomNumber);
		System.exit(0);
		// initializing variables for ArrayList and guessNumber;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.contains(5);

		int userGuess = -1;

		Scanner scan = new Scanner(System.in);

		do {

			// checking if this is the first time user enters, I am comparing the size of
			// the arraylist
			if (list.size() == 0)
				System.out.println("Enter your number");
			else if (userGuess < randomNumber)
				System.out.println("your guess is below than the number");
			else if (userGuess > randomNumber)
				System.out.println("your guess is above than the number");

			userGuess = Math.abs(scan.nextInt());

			if (userGuess == randomNumber)
				System.out.println("Congrats, You got it right!");

			// adding every guessed number to Arraylist
			list.add(userGuess);

		} while (userGuess != randomNumber);

		scan.close();

		// using method to show the final result
		showAllUniqueNumbers(list);
	}

// method returns the arraylist sorted and showing the only unique numbers
	public static ArrayList<Integer> showAllUniqueNumbers(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				// comparing the values of items, if index number is not same, delete the other
				// one
				if (list.get(i) == list.get(j) && i != j) {
					list.remove(j);
					// deleting an item shifting the index numbers, so that I reduce j by 1
					j--;
				}
			}
		}

		Collections.sort(list);
		System.out.println(list);
		return list;
	}

}
