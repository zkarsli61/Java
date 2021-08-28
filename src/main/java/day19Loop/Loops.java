package day19Loop;

import java.util.Arrays;
import java.util.Random;

public class Loops {

	public static void main(String[] args) {
		//Lesson05_1_for_Loop.timer(4);
		//System.out.println(removeDuplicates("racecar"));
		//System.out.println(isReverse("racecar"));
		//System.out.println(isPalindrome("madam"));
		//System.out.println(extracter("a1b2c3d4f5"));
		//System.out.println(Arrays.toString(arrayGenerater(10)));

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
		String reversed=reverse(s);
		System.out.println(reversed);
		System.out.println("String is " + (s.equals(reversed) ? "" : "not") + " Palindrom");
	}

	static boolean isPalindrom(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(i) != s.lastIndexOf(i)) {
				return false;
			}
		}
		return true;
	}
	// Write a method that removes Repeated Characters from a given String
	public static String removeDuplicates(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char eachLetter = str.charAt(i);
			if (!result.contains("" + eachLetter))
				result += eachLetter;
		}
		return result;
	}
	// Write a method to reverse a given String.
	static String reverse(String s) {
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--)
			reversed += s.charAt(i);
		return reversed;
	}

	//Write a method that returns the sum of numbers starting with 1 to the number passed into the method.
	static int sumOfNumbers(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++)
			sum += i;
		return sum;
	}
// print Even Numbers from num...
	public static void printEvenNumFrom(int num) {
		System.out.println("\r\n" + "Even Numbers from 20 to 0 are: ");
		while (num >= 0) {
			System.out.print(num + " ");
			num -= 2;
		}
	}


	//5. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
	static boolean isPalindrome(String str){
		//2nd Logic:
		String reversed =reverse(str);
		return reversed.equals(str);
	}

	//3. Write method that accepts a String and extracts letters and numbers. Method should return a String. EX: a1b2c3 --> Letters are abc and numbers are 123.
	static String extracter(String str){

		String letters, numbers;
		letters = numbers = "";

		for(int i = 0; i < str.length(); i++){
			char eachLetter = str.charAt(i);
			if(Character.isLetter(eachLetter))
				letters += eachLetter;
			if(Character.isDigit(eachLetter))
				numbers += eachLetter;
		}
		return "Letters are " + letters + " Numbers are " + numbers;
	}
	//8. Write a method that generates an single dimensional Array that consists of x numbers random numbers between 1 and 100. Method will accept int x as an argument.
	static int[] arrayGenerater(int num){
		int[] myArray = new int[num];
		for(int i = 0; i < myArray.length; i++)
			myArray[i] = new Random().nextInt(100);
		return myArray;
	}

	// 9. Write a method that accepts an Array of integers and returns the max and the secondMax.
	static String findMaxs(int[] arr){
		int max = Integer.MIN_VALUE + 1;
		int secondMax = Integer.MIN_VALUE;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int num : arr){
			if(num > max) {
				secondMax = max;
				max = num;
			}else if(num > secondMax && num != max)
				secondMax = num;
		}
		return "max is " + max + " secondMax is " + secondMax;
	}


}
