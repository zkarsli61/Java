package Questions;

import java.util.Scanner;

public class SubString01 {

	public static void main(String[] args) {
		//Substring is a part of String
		//index is used to get a part of a string
		
		String s1="Java is Java";
        System.out.println("12.satir= "+s1.substring(5));//is Java   5th indx is included
        System.out.println("13.satir= "+s1.substring(7));// Java   7th indx is included
        System.out.println("14.satir= "+s1.substring(5));//is Java   5th indx is included
        System.out.println("15.satir= "+s1.substring(0));//Java is Java
        //to get the last char of a String
        System.out.println("16.satir= "+s1.substring(s1.length()-1));//a  to get the last char of a String
        System.out.println("17.satir= "+s1.substring(11));//a
        System.out.println("18.satir= "+s1.substring(12));//   (space char)
       
        String s2="Java is OOP language";
        System.out.println("22.satir= "+s2.substring(0,3));//Jav  0 is inclusive 3 is exclusive
        System.out.println("23.satir= "+s2.substring(0,14));//Java is OOP la
        System.out.println("24.satir= "+s2.substring(5,6));//i
        // System.out.println(s1.substring(13));//java.lang.StringIndexOutOfBoundsException
        /*
        Ask user to enter a String 
        If the first and the last character of the String are same
        print "Wooow!" otherwise, print "Hmmmm!" on the console
    */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str5;
        str5=scan.nextLine();
        String first=str5.substring(0,1);
        String last=str5.substring(str5.length()-1);
        if(first.equals(last)) {
        	System.out.println("Wooow!");
        }else {
        	System.out.println("Hmmm!");
        }
	    scan.close();
	    System.out.println("==============");
	   
	    //            10121416 
	    String str6="  Ayse123 kaya/%  "; //print out should be Ayse kaya
	            //   0123456789 11131517 
	    //1.way 
	    System.out.println(str6.replaceAll("\\W", " ").replaceAll("\\d", "").trim().replace("kaya","KAYA"));
		//2.way
	    String first1=str6.substring(2,6);
		String last2=str6.substring(9,14).toUpperCase();
		System.out.println(first1+last2);
	}

}
