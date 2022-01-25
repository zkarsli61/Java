package Questions;

public class ArrayMxMinDiff {

	public static void main(String[] args) {
		 // verilen bir arraydeki maximum ve minumum degerleri bulup
	    // max-min degerini yazdiran bir method yaziniz
	    
	       
	          int[] arr ={25,14,3,56,87,45,62};
	         farkiBul(arr);
	        }
	    private static void farkiBul(int[] arr) {
	        
	        int maxSayi=Integer.MIN_VALUE; // -2140000000
	        int minSayi=Integer.MAX_VALUE; // 320000000
	        
	        for (int i = 0; i < arr.length; i++) {
	            
	            if (arr[i]>maxSayi) {  //25 max=25,-> 14 ,-> 3, -> 56 max=56
	                maxSayi=arr[i];
	            }
	            
	            if (arr[i]<minSayi) { // 25 min=25,-> 14, min=14, ->3 min=3, ->56 
	                minSayi=arr[i];
	            }
	        }
	        System.out.println("Arraydeki maximum sayi : " + maxSayi +
	                "\narraydeki minumum sayi : "+ minSayi +
	                "\nMax ve min sayilar arasindaki fark : " + (maxSayi-minSayi));
	    }
	    
	    
	}