package Questions;

import java.util.Arrays;

public class Array_RemoveSpecElmtInArray {

	public static void main(String[] args) {

		// write a program to remove a specific element from an array

		int[] myNums = { 23, 45, 15, 75, 28, 48 };
		int[] myNums_removed = new int[myNums.length - 1];

		System.out.println("my priginal array stores: " + Arrays.toString(myNums));

		int removeTheIndex = 2;// 2 ornek index nr...23-0.45-1,15-3 ..yani 2.index cikarilacak ornek ornek
								// olarak
		int j = 0;
		for (int i = 0; i < myNums.length; i++) {
			if (i == removeTheIndex) {
				continue;

			} else {
				myNums_removed[j] = myNums[i];
				j++;
			}
		}
		System.out.println("After remove the specific element" + Arrays.toString(myNums_removed));
	}
}