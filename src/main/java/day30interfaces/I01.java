package day30interfaces;

	/*
	 	1)interface is not a class, interface is an interface, thats it.
	 	2)interface is a storage for "abstract methods" and "public static final variables" 
	 	3)Normally we can store "abstract methods" and "public static final variables" in an "abstract class"
	 	  but abstract does not support multiple inheritance. Because of that Java created "interfaces" and interfaces 
	 	  can be used in multiple inheritance.
	 	4)interfaces do not have "constructors" because of that we cannot create objects from interfaces.
	 	5)All variables in an interface are automatically "public", "static", and "final"
	 		a)int x=12; and public int x=12; are completely same
	 */

public interface I01 {

	//VARIABLES
	int x = 11;
	int y = 12;

	//c variable is final automatically because of that we cannot change its value
	char c = 'A';
	//d is complaining because it is final and final variables must be initialized
	//char d;


	//You can access to Ali Can just  by using interface name, no need to create any object to access Ali Can
	//because, all variables are static in interfaces
	String s = "Ali Can";

	//All of the given variables are same
	int m = 13;
	int n = 13;
	int t = 13;
	int u = 13;

	//METHODS

	//2. Way to create concrete method in an interface
	//Use "static" keyword
	//If you use "static" keyword, it means the method has a "default implementation"
	//Like in abstract classes, if you create a concrete method in interface, it is not must to override
	static void subtract(int x, int y) {
		System.out.println("Result: " + (x - y));
	}

	//In interfaces all methods are public abstract as default, if you want you may use "public abstract" keyword or not
    //In interfaces all methods are public as default
	void add(int x, int y);

	//Until Java9, using concrete methods in an interface was not possible, bu in Java9, Java made an update
	//and let us to use concrete methods as well.

	void divide(int x, int y);

	//1. Way to create concrete method in an interface
	//Use "default" keyword, it is not access modifier, it is a specific keyword for interfaces
	//If you use "default" keyword, it means the method has a "default implementation"
	//Like in abstract classes, if you create a concrete method in interface, it is not must to override
	default void product(int x, int y) {
		System.out.println("Result: " + x * y);
	}

}
