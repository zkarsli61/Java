package Questions;

import java.util.ArrayList;
import java.util.List;

public class Array_RemoveDupElmntInArray {

	public static void main(String[] args) {
		 /*
         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

		int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
	      List <Integer> list=new ArrayList<>();
	      for (Integer each : arr) {
	          if (!list.contains(each)) {
	               list.add(each);
	          }
	      }
	      
	      System.out.println("listenin tekrarsiz hali : " + list);
//		
//		 System.out.println("Before remove : " + arr);
//		 List <Integer> yeniListe=new ArrayList<>();
//		  //ArrayList yeniListe = new ArrayList();
//	        for (int i = 0; i < yeniListe.size(); i++) {
//	            for (int j = 1; j < yeniListe.size(); j++) {
//	                if (yeniListe.get(i) == yeniListe.get(j)) {
//	                	yeniListe.remove(j);
//	                }
//	            }
//	        }
	        System.out.println("After remove duplicate items : "+list.toString());
	    }
	}
  


