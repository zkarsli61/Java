package Questions;

public class SwappingTwoIntegers {

	public static void main(String[] args) {
		tempMethod();
		withoutTempMethod();
	}

	public static void tempMethod() {
		// 1.yol with 3.rd variable(tempMethod)
		int a = 15;
		int b = 43;
		int temp;
		// System.out.println("Before swapping :"+"a="+a+","+"b="+b);
		System.out.println(a + "," + b);
		temp = a;
		a = b;
		b = temp;
		// System.out.println("After swapping :"+"a="+a+","+"b="+b);
		System.out.println(a + "," + b);

	}

	private static void withoutTempMethod() {
		// 2.yol withoutTempMethod
		int a, b;
		a = 23;
		b = 57;
		//System.out.println("Before swapping : a, b = " + a + ", " + +b);
		System.out.println(a + "," + b);
		a = a + b;
		b = a - b;
		a = a - b;
		//System.out.println("After swapping : a, b = " + a + ", " + +b);
		System.out.println(a + "," + b);
	}

}
