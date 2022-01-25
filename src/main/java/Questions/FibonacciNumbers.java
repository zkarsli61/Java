package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {

/*
	 * Fibonacci numbers are the numbers in the following integers
	 * 1,1,2,3,5,8,13,21,34,55,89,144...
	 * ask user to enter a number, print out all fibonacci numbers up to the number that user type
	 * 
	 */    
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
	    int num = scan.nextInt();   
		
		int n1 = 0 , n2 = 1 , result;
		
		for (int i = 0; i < num ; i++) {
			
		result = n1+n2;
		n1 = n2;
		n2=result;
		System.out.print(result+" ");
		scan.close();
		}
	
	}

}
//
//int sayi = read.nextInt();
//int arr1[] = new int[sayi];
//arr1[0] = 0;
//arr1[1] = 1;
//
//for (int i = 2; i < sayi; i++) {
//	arr1[i] = arr1[i - 1] + arr1[i - 2];
//	read.close();
//}
//System.out.println(Arrays.toString(arr1));
//
//}
//}






