package Questions;

import java.util.Scanner;

public class NumberPalindrome2 {

	public static void main(String[] args) {
		 
		        // Kullanicidan bir String alalim ve bu String'in 
		  // Kullanicidan bir String alalim ve bu String'in 
        // palindrome olup olmadigini yazdiralim
        // Ey Edip adanada pide ye
        // radar
        
        // ilk sorudaki ters cevirme metodunu kullanalim 
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen palindrome mu kontrol edeceginiz String'i yaziniz");
        String input=scan.nextLine();
        
        StringReverse obj=new StringReverse();
        String tersString=obj.arrayIleTersineCevir(input);
        
        if (input.equalsIgnoreCase(tersString)) {
            System.out.println("girdiginiz String palindrome");
        } else System.out.println("girdiginiz String palindrome degil");
        scan.close();
    }
}

