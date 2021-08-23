package day27exceptions;

public class E03 {

	public static void main(String[] args) {
		
		int a  = 12;
		int b = 0;
		
		try {
			
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Do not use zero as divisor..."+e.getMessage());

			
		}
		

	}

}
