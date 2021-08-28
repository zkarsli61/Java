package day19Loop;

import java.util.Arrays;

public class ReplitExamples {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 5, 6 };

		convert2Array("John");


	}

	static void convert2Array(String name) {
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 *
		 * (do not use toCharArray() method)
		 *
		 *
		 * Input : John
		 *
		 * Output :[J, o, h, n]
		 */

		char[] arr = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			arr[i] = name.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
	}

	static int[] add2Array(int[] a1, int[] a2) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
		 * array into a new Array and prints it.
		 *
		 * Input1={1,2,3,4}
		 *
		 * Input2={5,6}
		 *
		 * Output={1,2,3,4,5,6}
		 *
		 */
		int[] newArr = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			newArr[i] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			newArr[i + a1.length] = a2[i];
		}

		return newArr;
	}

	static int sumOfElement(int[] arr) {
		/*
		 * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array Then print the result in the main method.
		 *
		 * input : {1,2,3,4,5,6,7,8}; output: 36>
		 */
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	static void min_maxOfArray(int[] arr) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 *
		 * Input : {3,2,5,4,1,6} Output : min: 1 max: 6
		 */
		Arrays.sort(arr);
		System.out.println("min: " + arr[0]);
		System.out.println("max: " + arr[arr.length - 1]);
	}

	static double avgOfArray(int[] arr) {
		/*
		 * Write a java program that calculates the average value of array elements
		 *
		 * input[]= {1,2,3,4,5,6,7}
		 *
		 * Output : 4
		 */

		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / arr.length;

	}

	static int sumDigit(String s) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 *
		 * input : ade1r4d3 output : 8 Hint : Use Character.isDigit() Integer.valueOf()
		 */
		int sum = 0;
		char[] arr = s.toCharArray();
		for (char ch : arr) {
			if (Character.isDigit(ch)) {
				sum += Integer.valueOf(String.valueOf(ch));
			}
		}
		return sum;
	}

	static String reverseSentence(String s) {

		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters). Input : Coding is greate. Output : .etaerg si gnidoC
		 */
		String[] arr = s.split("");
		String revStr = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			revStr += arr[i];
		}
		return revStr;
	}

	static int reverseNum(int a) {
		int reverse = 0, digit = 0;
		while (a > 0) {
			digit = a % 10;
			a /= 10;
			reverse = reverse * 10 + digit;
		}
		return reverse;
	}

	public static String calcFactorial(int num) {
//		System.out.println(calcFactorial(6));
		int factorial = 1;
		String result = num + "!=";
		for (int j = num; j > 1; j--) {
			result += j + "*";
			factorial *= j;
		}
		result += "1=" + factorial;
		return result;
	}

	public static void findDuplicateChars(String str) {
//		findDuplicateChars("Javaisalsoeasy");
		char ch;
		String dubChars = "";
		for (int i = 0; i < str.length() / 2 + 1; i++) {
			ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				if (dubChars.indexOf(ch) < 0) {
					dubChars += ch;
				}
			}
		}

		System.out.println(Arrays.toString(dubChars.split("")));

	}

	public static void find_GCD_LCM(int a, int b) {

		// we should divide numbers until max value of numbers equals 1.
		int orj_a = a, orj_b = b;
		int max = a > b ? a : b;

		int GCD = 1, LCM = 1;
		int divisor = 2; // divisor will be increased, if any number is not divided by divisor.

		while (max > 1) {
			if (a % divisor == 0 && b % divisor == 0) {
				GCD *= divisor;
				LCM *= divisor;
				a = a / divisor;
				b = b / divisor;
			} else if (a % divisor == 0) {
				LCM *= divisor;
				a = a / divisor;
			} else if (b % divisor == 0) {
				LCM *= divisor;
				b = b / divisor;
			} else
				divisor++;

			max = a > b ? a : b;
//			System.out.println(max == 1 ? GCD + " " + LCM : a + " " + b + " " + divisor);
		}

		System.out.println("GCD for " + orj_a + " and " + orj_b + " = " + GCD);
		System.out.println("LCM for " + orj_a + " and " + orj_b + " = " + LCM);

	}

	public static int sumOfNaturalNumbers(int max) {
		// sumOFNaturalNumbers(100);
//		System.out.println(sumOfNaturalNumbers(100));
		int sum = 0;
		for (int j = 1; j <= max; j++) {
			sum += j;
		}
		return sum;
	}

	public static int numChar(char ch1, String name) {
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("enter a name ");
		 * String name = scan.nextLine(); System.out.print("and a character "); char ch1
		 * = scan.nextLine().charAt(0);
		 */
//		System.out.print("number of a =" + numChar('a', "John came late"));

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch1) {
				count++;
			}
		}
		return count;
	}

	public static int sum2Num(int i, int j) {
		return i + j;

	}

	public static void calcForNumbers(int num1, int num2) {
		// calcForNumbers(100,25);
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num1 - num2);
		System.out.println(num1 / num2);
	}

	public static void calcForCircle(int r) {
		// Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
		// calcForCircle(7);

		double pi = 3.14;
		double perimeter = 2 * pi * r;
		double area = pi * Math.pow(r, 2);
		System.out.println("Dairenin Cevresi : " + perimeter);
		System.out.println("Dairenin Alani : " + area);
	}

	public static void calcForSquare(int a, int b) {
		// calcForSquare(5, 3);

//		Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

		System.out.println("Dikdortgenin Cevresi :" + (2 * (a + b)));
		System.out.println("Dikdortgenin Alani :" + (a * b));

	}

	public static void averageNumbers() {

//		Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
//
//		Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
//
//		Ornek Cikti:
//
//		Sayilarin Ortalamasi : 30

		int[] nums = { 22, 20, 30, 28, 50 };
		int sum = 0, avg = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		avg = sum / nums.length;
		System.out.println(avg);
	}

	public static void swapInputs() {

		int a = 3;
		int b = 5;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
