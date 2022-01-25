package Questions;

import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {
	
		   // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
        // 153 % 10=3
        // 153 / 10 = 15.3 ama java bunu 15'e cevirir
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Armstrongoldugunu kontrol edeceginiz tamsayiyi yaziniz");
        int sayi=scan.nextInt();
        
        
        //12345 
        // once gerekli degiskenleri olusturalim
        int kuplerToplami=0;
        int ilkDeger=sayi;
        int rakam=0;
       
        while(sayi != 0) {
            rakam=sayi%10;
            kuplerToplami+=rakam*rakam*rakam;
            sayi/=10;
            //System.out.println(rakam+" "+kuplerToplami); adim adim yazdirmak istersek
            scan.close();
        }
        
        // elimde kuplerToplami, ilkDeger , sayi=0 oldu
        
        if (kuplerToplami==ilkDeger) {
            System.out.println("Girdiginiz sayi Armstrong sayi");
        } else System.out.println("Girdiginiz sayi Armstrong sayi degil");
    }
}
	
