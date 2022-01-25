package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciWithArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		int arr[] = new int[sayi];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < sayi; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
			scan.close();
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("===========List ile cozum===============");
		List<Integer>list=new ArrayList<>();
		list.add(0);
		list.add(1);
		for (int i = 2;  list.get(0)+list.get(1)< sayi; i++) {
			list.add(list.get(i - 2) + list.get(i - 1));
		}
//		List<Integer> fibo = new ArrayList<>();
//
//		fibo.add(1);
//		fibo.add(1);
//		// System.out.println(fibo); //[0, 1]
//		for (int i = 2; fibo.get(i - 2) + fibo.get(i - 1) < sayi; i++) {
//			fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
//		}
//
//		System.out.println(fibo);
//
//		
	}
}