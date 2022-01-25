package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayIcindekiSaylarinToplamlariniSifirYakinSiralama {
//  Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
// Verilen pozitif ve negatif sayi dizisindeki iki sayinin toplamlari sifira en yakin olacak sekilde bulmak icin bir Java programi yazin.
	public static void main(String[] args) {
		int arr[] = { 1, 5, -4, 7, 8, -6 };
		List<Integer> sum = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				sum.add((arr[i] + arr[j]));

			}
		}
		// System.out.println(sum); // yazmasak olur
		for (int i = 0; i < sum.size(); i++) {
			if (sum.get(i) < 0) {
				sum.set(i, sum.get(i) * -1);
			}
		
		}
	//	System.out.println(sum);// yazmasak olur
		Collections.sort(sum); // Arrayi siralar
	//System.out.println(sum);
		
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] + arr[j]) == sum.get(0)) {// arrayin 0. indexteki elemani en kucuk toplamdir. Bu
																// toplama absolute value (mutlak degerce) esit olan
																// arrayin herhangi iki elemanini buluyoruz
					System.out.println("the two elements from the array such that their sum is closest to zero are:"
							+ arr[i] + " and " + arr[j]);
				}
			}
		}
	}
}

