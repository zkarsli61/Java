package Examples;

import java.util.Arrays;
import java.util.Random;

public class OfficeHours {

	public static void main(String[] args) {
		Random rn = new Random();
		System.out.println(rn.nextInt(60));
	}

	public static void convertArr(int[] input) {
//		int[] input = { 1, 2, 3 };

		int[] output = new int[input.length * input.length];
		for (int i = 0; i < input.length; i++) {
			output[(i) * 4] = input[i];
		}
		System.out.println(Arrays.toString(output));
	}

	public static void merge(int[] arr, int[] arr1) {
//		int[] arr = { 8, 2, 3 };
//		int[] arr1 = { 4, 5, 6 };

		int arr3[] = new int[arr.length + arr1.length];
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			arr3[arr.length + i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
	}

	public static int countEvenNumbers(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void acceptString(String name1, String name2, String name3) {
		String[] arr = { name1, name2, name3 };

		System.out.println(Arrays.toString(arr));
	}

	public static String trimStr(String str1, String str2) {
		return str1.replace(str2, "").trim();
	}

	public static String merge(String str1, String str2) {
		return str1.substring(0, 4).concat(str2).concat(str1.substring(4));
	}

	public static void mergeStr(String str1, String str2) {

		for (int i = 0; i < str1.length(); i++) {

			System.out.print("" + str1.charAt(i) + str2.charAt(i));
		}
	}

	public static void calcJava(String a) {
		int i = 0;
		int len = a.length();
		int count = 0;

		do {
			i = a.indexOf("java", i);

			if (i >= 0) {
				count++;
				i += 4;
			} else {
				break;
			}
			a.indexOf(a, i);

		} while (i < len || i >= 0);
		System.out.println(count);
	}

	public static void writeJava() {
		for (int i = 0; i < 34; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("JavaTheBest");
			} else if (i % 3 == 0) {
				System.out.println("Java");
			} else if (i % 5 == 0) {
				System.out.println("Best");
			} else
				System.out.println(i);

		}

	}
}
