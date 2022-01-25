package Questions;

public class StringBuilderBufferfarki {

	public static void main(String[] args) {
		//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
	
		        long startTime = System.currentTimeMillis();  
		        StringBuffer sb = new StringBuffer("Java");  
		        for (int i=0; i<10000; i++){  
		            sb.append("Tpoint");  
		        }  
		        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
		        startTime = System.currentTimeMillis();  
		        StringBuilder sb2 = new StringBuilder("Java");  
		        for (int i=0; i<10000; i++){  
		            sb2.append("Tpoint");  
		        }  
		        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
		    }  
		}  
/*
 
Difference between StringBuffer and StringBuilder
Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. 
The String class is an immutable class whereas StringBuffer and StringBuilder classes are mutable. 

A list of differences between StringBuffer and StringBuilder are given below:

                         StringBuffer	                                                   StringBuilder
1)	StringBuffer is synchronized i.e. thread safe.                             	StringBuilder is non-synchronized i.e. not thread safe. 
It means two threads can't call the methods of StringBuffer simultaneously.     It means two threads can call the methods of StringBuilder simultaneously.
2)	StringBuffer is less efficient than StringBuilder.	                        StringBuilder is more efficient than StringBuffer.
 */

