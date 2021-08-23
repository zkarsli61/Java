package day28exceptions;

public class E03 {
	
	/*
	 	1)ArrayIndexOutOfBoundsException is thrown if you use non-existing index in Arrays
	 	2)ArrayIndexOutOfBoundsException is an un-checked exception
	 	
	 	3)ClassCastException is thrown if you try to cast a data type to another which is not supported by Java
	 	4)ClassCastException is an un-checked exception
	 	
	 	5)NumberFormatException is thrown if you use non-digit characters in a String and use parseInt()
	 	4)NumberFormatException is an un-checked exception
	*/

	public static void main(String[] args) {
		
		//ArrayIndexOutOfBoundsException	
//		String s[] = {"A", "D", "B", "C"};		
//		System.out.println(s[2]);//B		
//		try {			
//			System.out.println(s[4]);//ArrayIndexOutOfBoundsException			
//		}catch(ArrayIndexOutOfBoundsException e) {			
//			System.out.println("Do not use non-existing index " + e.getMessage());			
//		}
		
		//ClassCastException
//		Object obj = 70;		
//		String num = (String)obj;
		
		//NumberFormatException
		String s1 = "123";
		int num1 = Integer.parseInt(s1);
		System.out.println(num1 + 5);//128
		
		String s2 = "1a2b3c";
		try {
			int num2 = Integer.parseInt(s2);//NumberFormatException
			System.out.println(num2 + 5);
		}catch(NumberFormatException e) {
			System.out.println("You used non-digit characters in the String");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
