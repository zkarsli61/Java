package Questions;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		/*
		 * Generate a random number between 0-100 to be guessed use scanner and while
		 * loop
		 */
		int randomNum = (int) (Math.random() * 101);
		System.out.println("Guess a number between 0 and 100");
		Scanner input = new Scanner(System.in);
		int guess = 0;
		while (guess != randomNum) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			if (guess == randomNum) {
				System.out.println("Yes, You Guest it Right! The Number is " + randomNum);
			} else if (guess > randomNum) {
				System.out.println("Your guess is higher");
			} else {
				System.out.println("Your guess is lower");
			}
		}
	}
}
