package day27_JavaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class A3 {

	public static void main(String[] args) {

//		System.out.println(sumAll(15));
//		System.out.println(sumAllLE(15));
		String s = "ömer";
//		System.out.println(removeDublicates(s));
//		System.out.println(removeDublicatesLE(s));

//		System.out.println(reverse(s));
//		System.out.println(reverseLE(s));

//	 System.out.println(isPalindrom("zazaz"));
		System.out.println(Arrays.toString(generateArr(15)));
	}
	// Write a method that returns the sum of numbers starting with 1
	private static int sumAll(int num) {
		int sum = 0;
		for (int j = 0; j <= num; j++) {
			sum += j;
		}
		return sum;
	}
	private static int sumAllLE(int num) {
		return IntStream.rangeClosed(1,num).sum();
	}
	// Write a method that removes Repeated Characters from a given String
	public static String removeDublicates(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char eachLetter = str.charAt(i);
			if (!result.contains("" + eachLetter))
				result += eachLetter;
		}
		return result;
	}
	public static String removeDublicatesLE(String str) {
		return Arrays.stream(str.split("")).distinct().map(e->e.toString()).reduce("",String::concat);
	}

	// Write a method to reverse a given String.
	static String reverse(String s) {
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--)
			reversed += s.charAt(i);
		return reversed;
	}
	static String reverseLE(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	// Write a method that generates an single dimensional Array that
	// consists of x numbers random numbers between 1 and 100.
	// Method will accept int x as an argument.

	static int[] generateArr(int x) {
		int[] result = new int[x];
		for (int i = 0; i < x; i++) {
			result[i] = new Random().nextInt(100);
		}
		return result;
	}
//	static int[] generateArrLE(int x) {
//		int[] result = new int[x];
//		return Arrays.stream(result).map(Random.nextInt(bound));
//	}

	static boolean isPalindrom(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(i) != s.lastIndexOf(i)) {
				return false;
			}
		}
		return true;
	}
}
