package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListedenTekrarlariSilme {

	public static void main(String[] args) {
		  // kullanicidan sifirdan farkli int degerler alarak bir list olusturun
	      // kullanici 0'a basarsa sayi alma islemi bitsin
	      // sonra girilen sayilardan tekrar edenleri silip listeyi yazdirin
	    
		
		    int sayi=15;
	        Scanner scan=new Scanner(System.in);
	        List<Integer> liste = new ArrayList<>(); 
	        
	        while(sayi!=0) { //for lopp kullanilmasinin nedeni listede index olmamasi
	            System.out.println("listeye eklemek istediginiz tamsayiyi giriniz"
	                    + "\nBitirmek icin 0'a basiniz");
	            sayi=scan.nextInt();
	            if (sayi!=0) {
	                liste.add(sayi);
	            }
	        }
	        
	        System.out.println("girdiginiz liste : " + liste);
	        
	        
	        // bir listeden tekrar eden sayilari nasil silersiniz ?
	        // yeni bir list olustururuz, ilk listeden elementleri alir,
	        // yeni listede yoksa eklerim 25,25,36,14,15,25
	        // 25,36,14,15
	      List <Integer> yeniListe=new ArrayList<>();
	      for (Integer each : liste) {
	          if (!yeniListe.contains(each)) {
	              yeniListe.add(each);
	          }
	      }
	      
	      System.out.println("listenin tekrarsiz hali : " + yeniListe);
	        
	        // 2.yol girilen sayilarin olusturdugu listeyi Set'e donustururum
	        
	        // convert islemi akliniza gelmezse bir Set olusturup listedeki tum
	        // sayilari Set'e ekleyebilirsiniz
	        
	        Set <Integer> sayilarKumesi=new HashSet(liste);
	        System.out.println("Set ile tekrarsiz liste : " + sayilarKumesi);
            scan.close();
            
	    }

}
