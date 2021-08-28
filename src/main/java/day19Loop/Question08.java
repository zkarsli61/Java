package day19Loop;

import java.util.Arrays;

public class Question08 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 5, 4, 1, 6 };
		printMinMax(arr);
	}

	public static void printMinMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("min:" + arr[0] + " max:" + arr[arr.length - 1]);
	}

}
