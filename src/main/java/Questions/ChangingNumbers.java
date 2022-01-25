package Questions;

import java.util.Scanner;

public class ChangingNumbers {

		 public static void main(String[] args) {
		        // Kullanicidan iki sayi alip bunlari degistirelim(swap)
		        // 1 .yol 3. bir degisken kullanarak degistirebiliriz
		        Scanner scan=new Scanner(System.in);
		        System.out.println("Lutfen degistirmek istediginiz ilk sayiyi girin ");
		        int sayi1=scan.nextInt();
		        System.out.println("Lutfen degistirmek istediginiz ikinci sayiyi girin ");
		        int sayi2=scan.nextInt();
		        
		        // A 2  B 3  C --
		        // C=A (2) 
		        // A=B (3)
		        // B=C (2)
		        
		        int sayi3=sayi1;
		        sayi1=sayi2;
		        sayi2=sayi3;
		        
		        System.out.println("ilk sayinin yeni degeri : " + sayi1 + 
		                "\nikinci sayinin yeni degeri : " + sayi2);
		        
		        //2.yol 3.bir degisken olmadan sayilarin yerlerini degistirin
		        
		        // a=10 b=20 
		        // a=10+20=30
		        // a=30 b=20
		        // b=30-20=a-b
		        // b=10 a=30
		        // b=10 a=a-b=10
		        
		        
		        sayi1=sayi1+sayi2; 
		        sayi2=sayi1-sayi2;  
		        sayi1=sayi1-sayi2;  
		        System.out.println("ilk sayinin 2.yeni degeri : " + sayi1 + 
		        		"\nikinci sayinin 2.yeni degeri : " + sayi2);
		        scan.close();
		 }
	}