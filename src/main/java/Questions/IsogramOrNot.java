package Questions;

import java.util.Scanner;

public class IsogramOrNot {

	public static void main(String[] args) {
		/*
		 * Question: Given a String S of lowercase alphabets, check if it is isogram(kelime icinde tekrarlanan harf) or not. An isogram is a String
		 * in which no letter accure more than once. Print 1 if String is Isogram else print 0
		 * Isograms are words in which the letters turn up an equal number of times.
		 * İzogramlar, harflerin eşit sayıda ortaya çıktığı kelimelerdir.
		 */
          Scanner scan = new Scanner(System.in);
		  System.out.println("Type something :");
		  String str = scan.nextLine();
		  boolean result = true;
		  
		Nilgun :  for (int i = 0; i < str.length(); i++) { //1.loop ta n harfini tutarken takip eden her farfi n ile karsilastiryoruz ta ki son harfe kada  
		  for (int n = 0; n < str.length(); n++) {          // 2.loopa gerek duyuyoruz cunku bu kez nilgunun ikinci harfi olan i den basliyacaz..length de ilk sayi o ikinci ise 1 oldugundan ornegin n harfi ile adlandirip bu kez 1 den basliyoruz taki n sayisina kadar 
			  
		  if(str.charAt(i) ==  str.charAt(n) && i!=n) {  //char primitive oldugundan = degil == olur
		     result = false;
			  break Nilgun ;
		    }        //=====>>>>>if in kapanisi
		   }	     //======>>>>ikinci loopn kapanisi
		  }          //======>>>>>birinci loopun kapanisi
		  if(result) {
			  System.out.println("It is an isogram");
		  }else {
			  System.out.println("It is not an isogram");
		  }
		 
		  
		  
	}

	}
